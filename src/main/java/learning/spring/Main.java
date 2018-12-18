package learning.spring;

import learning.components.Donkey;
import learning.components.Goal;
import learning.spring.configuration.SpringConfig;
import learning.spring.configuration.SuibianSpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class Main {

    public static void chuantongXMLStyle () {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/learning/spring/my-spring.xml");
        //根据 my-spring.xml 中配置的 bean 的 id 取对象
        BookService bs1 = (BookService) context.getBean("bs2");
        bs1.sayHello();
        // 根据类去取对象，这里根据 BookService 接口去拿具体的实现类,如果在 xml 配置文件里配置了俩个实现接口的对象，将会报错
        //No qualifying bean of type 'learning.spring.BookService' available: expected single matching bean but found 2: bs1,bs2
        //没有“learning.spring”类型的合格bean。图书服务'可用:预期单个匹配bean，但发现2:bs1,bs2
//        context.getBean(BookService.class).sayHello();
        //也可以根据具体的实现类
        BookService ps1 = (BookService) context.getBean("ps1");
        System.out.println("哈哈哈哈哈哈");
        ps1.sayHello();
        context.getBean(BookServiceImpl.class).sayHello();
        System.out.println(context.getBean(Goal.class).toString());
        System.out.println(context.getBean(Donkey.class).toString());
    }

    public static void zhuliudeJavaStyle(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SuibianSpringConfig.class);
        BookService bs1 = (BookService) context.getBean("bs1");
        bs1.sayHello();
        Goal goal = (Goal) context.getBean("goal");
        System.out.println(goal.toString());

        Donkey dk = (Donkey) context.getBean("dk");
        System.out.println(dk.toString());
    }

    public static void main(String[] args) {
//        chuantongXMLStyle();
//        zhuliudeJavaStyle();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = context.getBean(DataSource.class);
    }
}
