package proxy.p6;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CGRecordProxyGenerator implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法名:" + method.getName());
        Object o1 = methodProxy.invokeSuper(o, objects);

        System.out.println("结果是" + o1);

        return o1;
    }
}
