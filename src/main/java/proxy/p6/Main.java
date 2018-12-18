package proxy.p6;

import org.springframework.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
//        Enhancer enhancer = new Enhancer();
//        enhancer.setClassLoader(Thread.currentThread().getContextClassLoader());
//        enhancer.setSuperclass(ChinaBank.class);
//        enhancer.setCallback(new CGRecordProxyGenerator());
//
//        ChinaBank bankWithRecord = (ChinaBank) enhancer.create();
//        bankWithRecord.withdraw(333);

        // 利用构造函数的方式进行创建
        ChinaBank chinaBank = (ChinaBank) Enhancer.create(ChinaBank.class, null, new CGRecordProxyGenerator());
        chinaBank.withdraw(233);
        System.out.println(64 >>> 2);

    }
}
