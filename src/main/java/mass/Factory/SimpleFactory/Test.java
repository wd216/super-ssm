package mass.Factory.SimpleFactory;

public class Test {
    public static void main(String[] args) {
        PhoneFactory pf = new PhoneFactory();
        pf.createPhone("hw").play();
        pf.createPhone("sx").play();
        pf.createPhone("pg").play();

        //这是简单工厂模式，本身已经为解决耦合作出了方案，但有缺点
        //PhoneFactory 代码跟 Phone 代码紧耦合
        //比如这时多加了一款手机实现了 Phone 接口，PhoneFactory 则需要多加判断，或者实现 Phone 接口的类该掉类名，或删除类
        //PhoneFactory 则需要改变里面的代码


    }
}
