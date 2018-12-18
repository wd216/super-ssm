package learning.spring.configuration;

import learning.components.Donkey;
import learning.components.DonkeyWife;
import learning.components.Goal;
import learning.spring.BookDAO;
import learning.spring.BookService;
import learning.spring.BookService2Impl;
import learning.spring.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

@Configuration
@ComponentScan(basePackages = "learning.components")
public class SuibianSpringConfig {
    @Bean
//    <bean id = "bs1" class = ""learning.spring.BookServiceImpl/> 相当于 @Bean
    public BookService bs1(){
        System.out.println();
        if (Math.random() > 0.5){
            return new BookServiceImpl();
        }else{
            return new BookService2Impl();
        }
    }
    @Bean
    public BookDAO bookDAO () {return new BookDAO();}

    @Bean
    public Goal goal(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add(0,"聪明");
        strings.add(1,"机智");
        Goal goal = new Goal();
        goal.setName("喜羊羊");
        goal.setCountOfLegs(4);
        goal.setAliases(strings);
        return goal;
    }

    @Bean
    public DonkeyWife dkw(){
        return new DonkeyWife("多莉妻子");
    }

    @Bean
    public Donkey dk(){
        return new Donkey("多莉",88f,dkw());
    }

}
