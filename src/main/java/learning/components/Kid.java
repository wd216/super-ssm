package learning.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;

@Component
public class Kid {
    @Value("王 小敏")
    private String name;

    @Override
    public String toString() {
        return "Kid{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getXing() {
        return name.split(" ")[0];
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException {
//        ApplicationContext context = null;
//        Kid kid = context.getBean(Kid.class);
//        System.out.println(kid.getXing());

        //因为 name 属性设置为私有的，所以在 spring 容器调用的话，是为 null 这里可以设置值的原因是
        //在这个类中可以直接拿的到 name 属性，在这个类外将设置不了值，除非使用反射的方式
        Kid kid = Kid.class.newInstance();
        kid.name = "aa";
        System.out.println(kid.name);

        //采用反射的方式给 name 属性设置
        Kid kid1 = new Kid();
        // kid1.getClass() 拿到 kid1 的类 再调用 getDeclaredField("name") 根据传入的参数拿到具体的属性
        Field name = kid1.getClass().getDeclaredField("name");
        // setAccessible 通过这个方式设置可以设置属性的值，因为 name 是使用的，想要设置的话需要一定的权限
        name.setAccessible(true);
        name.set(kid1,"aaaaaa");
        System.out.println(kid1);

    }
}
