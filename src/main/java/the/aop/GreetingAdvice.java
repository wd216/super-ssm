package the.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingAdvice {

    @Before("execution(* *.*(..))")
    public void greeting() {
        System.out.println("中国人民银行爱存不存..");
    }

    @After("execution(* *.*(..))")
    public void bye() {
        System.out.println("byebye");
    }

    public void goujiao () {
        System.out.println("wwwwwww....");
    }
}
