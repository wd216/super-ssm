package proxy.p5;

import proxy.p3.JdkSingleProxyGenerator;

import java.lang.reflect.Proxy;

public class Bank implements Withdrable {

    @Override
    public void withdraw(float howmuch) {
        if (howmuch > 1000) {
            System.out.println("您没有那么大的额度，请重试");
        } else if (howmuch < 0) {
            System.out.println("取款必须要大于 0 元");
        } else {
            System.out.println("原先余额 - howmuch");
        }
    }
    public static void withdrawWithRecord (float howmuch) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        Withdrable withdrable = (Withdrable) java.lang.reflect.Proxy.newProxyInstance(
                loader, Bank.class.getInterfaces(),
                new JdkRecordProxyGeneratory(new Bank())
        );

        Withdrable withdrableCanSing = (Withdrable) Proxy.newProxyInstance(
                loader, Bank.class.getInterfaces(),
                new JdkSingleProxyGenerator(withdrable)
        );

        withdrableCanSing.withdraw(howmuch);
    }
}
