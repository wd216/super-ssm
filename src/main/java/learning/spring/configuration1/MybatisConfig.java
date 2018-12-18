package learning.spring.configuration1;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration

public class MybatisConfig {
    @Bean
    public DataSource dataSource() {
        ComboPooledDataSource source = new ComboPooledDataSource();
//        SimpleDriverDataSource source = new SimpleDriverDataSource();
        source.setJdbcUrl("jdbc:mariadb://localhost:3306/stu");
//        source.setDriverClass();
        source.setUser("");
        source.setPassword("");
        return source;
    }





}
