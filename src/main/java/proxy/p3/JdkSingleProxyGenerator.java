package proxy.p3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkSingleProxyGenerator implements InvocationHandler {

    private final Object yaobeidailideduixiang;

    public JdkSingleProxyGenerator(Object o) {
        this.yaobeidailideduixiang = o;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("我对你的嗷嗷嗷嗷不完");
        Object invoke = method.invoke(yaobeidailideduixiang, args);


        return invoke;
    }
}
