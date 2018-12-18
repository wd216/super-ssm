package the.aop.zgrmyh;

import org.springframework.stereotype.Component;

@Component
public class Bank {
    public float withdraw(float howmuch) {
        if (howmuch > 1000) {
            System.out.println("你的余额里面额度不够、。。。。");
        } else if (howmuch < 0) {
            System.out.println("取款必须要大于 0 元");
        } else {
            System.out.println("原先余额 - xxx - 取出来 " + howmuch + " 元");
        }
        return howmuch;
    }

    public void withdraw(float how, int others) {
    }
}
