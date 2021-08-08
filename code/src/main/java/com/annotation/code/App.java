package com.annotation.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach =  context.getBean("trackCoach",Coach.class);
		
		// call methods on the bean
    	
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getMyFortune());
    }
}
