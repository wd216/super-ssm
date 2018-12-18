package mass.Factory.entity;

public class Test {
    public static void main(String[] args) {
        // 使用接口的方式
        Phone p1 = new Iphone();
        p1.play();
        Phone p2 = new HuaWei();
        p2.play();
        //这种方式有缺点
        //1.客户端，必须要知道手机类的具体名字
        //2.客户端的调用，跟提供的代码是耦合的
        //比如 Phone 接口发生了改变，实现接口的实体类都需要作出改变



    }
}
