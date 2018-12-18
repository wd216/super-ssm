package the.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import the.aop.zgrmyh.Bank;
import the.aop.zgrmyh.Licaizhongxin;

public class YMain {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("learning/spring/aop.xml");
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);


        Bank bank = ioc.getBean(Bank.class);
        bank.withdraw(444);
        System.out.println("==============");
        Licaizhongxin bean1 = ioc.getBean(Licaizhongxin.class);
        bean1.tuixiao();
    }
}
