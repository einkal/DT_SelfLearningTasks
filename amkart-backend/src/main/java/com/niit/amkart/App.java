package com.niit.amkart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.amkart.dao.UserDAO;
import com.niit.amkart.daoimpl.UserDAOImpl;
import com.niit.amkart.model.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.refresh();
        context.scan("com.niit.amkart");

		UserDAO userdao=(UserDAO)context.getBean("UserDAO", UserDAOImpl.class);
		User user=(User)context.getBean("user", User.class);
		user.setEmail("abc@gmail.com");
		user.setName("ABC");
		user.setPassword("abc123");
		System.out.println(user.getEmail());
		userdao.createUser(user);
    }
}
