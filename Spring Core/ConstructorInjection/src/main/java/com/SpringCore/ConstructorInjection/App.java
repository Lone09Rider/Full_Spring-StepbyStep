package com.SpringCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        Alien obj = (Alien)context.getBean("alien");
        obj.work();
        System.out.println(obj.getAge());
        
        
    }
}
