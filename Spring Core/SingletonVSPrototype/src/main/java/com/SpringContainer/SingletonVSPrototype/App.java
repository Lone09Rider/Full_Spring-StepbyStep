package com.SpringContainer.SingletonVSPrototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
    	
    	Alien obj = (Alien)factory.getBean("alien");
    	obj.work();
    	obj.age = 22;
    	System.out.println(obj.age);
    	
    	Alien obj2 = (Alien)factory.getBean("alien");
    	obj2.work();
    	System.out.println(obj2.age);
    	
//    	This is given in the bean scope of spring.xml
    	
//    	If no object created in prototype then constructor will not be called 
    	
//    	If no object created in singleton then constructor will be called  
    	
    }
}
