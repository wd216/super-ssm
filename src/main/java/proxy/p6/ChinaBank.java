package proxy.p6;

public class ChinaBank {
    public float withdraw (float howmuch) {
        if (howmuch > 2000) {
            System.out.println("账户余额不够，请重新选取。。。。");
        } else if (howmuch < 0){
            System.out.println("取款余额必须大于 0 元");
        } else {
            System.out.println("账户余额 - 取款余额(howmuch)");
        }
        return howmuch;
    }
}
