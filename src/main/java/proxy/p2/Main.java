package proxy.p2;

public class Main {
    public static void main(String[] args) {
        Sleepable g = new Girl();
        g.sleep();
        System.out.println("==========================");
        GirlProxy girlProxy = new GirlProxy(g);
        long start = System.currentTimeMillis();
        girlProxy.sleep();
        long end = System.currentTimeMillis();
        System.out.println("耗时:" + (end - start)/1000.0 + "秒");
    }
}
