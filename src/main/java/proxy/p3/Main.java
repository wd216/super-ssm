package proxy.p3;

import proxy.p1.Examable;
import proxy.p1.Student;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        ClassLoader cl = Thread.currentThread().getContextClassLoader();

        Examable o = (Examable) Proxy.newProxyInstance(
                cl, new Class[] { Examable.class },
                new JdkSingleProxyGenerator(new Student())
        );
        o.exam();

    }
}
