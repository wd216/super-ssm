package mass.Factory.FactoryMethod;

import mass.Factory.entity.Phone;


public class Test {
    public static void main(String[] args) {
        PhoneFactory pf = new IphoneFactory();
        Phone phone = pf.createPhone();
        phone.play();

        //为创建手机添加一个接口 PhoneFactory 定义一个创建手机的方法 createPhone
        //再为每个手机添加一个 实现了 PhoneFactory 接口的工厂类 实现里面的创建手机方法
        // 这样再做添加一部手机的话 只需要再添加一个实现了 PhoneFactory 接口的工厂类，
        //解决掉简单工厂 PhoneFactory 与 Phone 接口的紧耦合

    }
}
