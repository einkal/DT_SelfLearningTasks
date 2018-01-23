package com.niit.amkart.config;
import javax.sql.DataSource;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import java.util.Properties;
import com.niit.amkart.model.*;
import org.hibernate.SessionFactory;
@SuppressWarnings("deprecation")
@Configuration
@ComponentScan("com.niit.amkart")
public class ApplicationContext {
	@Autowired
    @Bean(name="dataSource")    
    public DataSource getDataSource()
    {
        DriverManagerDataSource ds = new DriverManagerDataSource();        
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:tcp://localhost/~/onlineshopping");
        ds.setUsername("sa");
        ds.setPassword("");     
        System.out.println("H2 connected");
        return ds;
    }
	
	@Bean(name="transactionManager")
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
    {
        HibernateTransactionManager htm = new HibernateTransactionManager();
        htm.setSessionFactory(sessionFactory);
        return htm;
    }
   
   
    @Autowired   
    @Bean(name="sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource)
    {
        LocalSessionFactoryBuilder sb= new LocalSessionFactoryBuilder(dataSource);
        sb.addProperties(getHibernateProperties());
        sb.addAnnotatedClass(User.class);
        return sb.buildSessionFactory();
    }

    @Bean
    public Properties getHibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.put("hibernate.show_sql", true);
        properties.put("hibernate.hbm2ddl.auto", "create");
        System.out.println("Table created");
        return properties;
    }
    
	
	
}
