package proxy.p5;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JdkRecordProxyGeneratory implements InvocationHandler {
    private Object object;

    public JdkRecordProxyGeneratory(Object o) {
        this.object = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {

        System.out.println("xx 在 yy 时间 做了 xxx 操作");
        System.out.println("若干代码");
        System.out.println("执行完了之后，才能到下一步");
        return method.invoke(object,args);
    }
}
