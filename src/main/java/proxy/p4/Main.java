package proxy.p4;

import proxy.p2.Girl;
import proxy.p2.Sleepable;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Sleepable sleepable = (Sleepable) Proxy.newProxyInstance(
                loader, Girl.class.getInterfaces(),
                new JdkDemoProxyGenerator(new Girl())
        );
        sleepable.sleep();
    }
}
