package learning.spring.configuration;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.io.IOException;

@Configuration
public class MybatisConfig {

    @Autowired
    Environment env;

    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.driver}")
    private String driver;

    @Bean
    public static PropertySourcesPlaceholderConfigurer ppp () {
        return new PropertySourcesPlaceholderConfigurer();
    }
    @Bean
    public DataSource dataSource () throws PropertyVetoException {
//        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//        PoolDataSource poolDataSource = new PoolDataSource();
        ComboPooledDataSource source = new ComboPooledDataSource();
        source.setJdbcUrl(jdbcUrl);
        source.setDriverClass(driver);

        source.setMaxPoolSize(30);
        return source;
    }
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory (DataSource dataSource) throws IOException {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));

        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        bean.setMapperLocations(resolver.getResources("classpath:mapper/*.class"));
        bean.setDataSource(dataSource);
        return bean;
    }

}
