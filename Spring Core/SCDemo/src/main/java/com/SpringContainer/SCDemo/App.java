package com.SpringContainer.SCDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Alien obj = (Alien)context.getBean("alien");
    	obj.work();
    	obj.age = 22;
    	System.out.println(obj.age);
    	
    	Alien obj2 = (Alien)context.getBean("alien");
    	obj2.work();
    	System.out.println(obj2.age);
//    	Due to Spring Container both objects are referring to same object
//    	even if not initialized
    	
    	// ** If we DONT CREATE THE OBJECT **
//    	Still the Constructor runs because 
//    	     ApplicationCotext Creates the spring container ** //
    }
}
