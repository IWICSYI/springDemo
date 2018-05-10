package com.lol.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springConfig\bean scope - applicationContext.xml");
	
	Coach theCoach=context.getBean("myCoach",Coach.class);
	
	Coach alphaCoach=context.getBean("myCoach",Coach.class);

	boolean result=(theCoach==alphaCoach);
	
	
	System.out.println("\nPointing to the same result "+result);
	
	System.out.println("\nMemory location for theCoach "+theCoach);
	
	System.out.println("\nMemory location for alphaCoach "+alphaCoach);
	
	
	Coach cricketCoach=context.getBean("myCricketCoach", Coach.class);
	context.close();

	
	}

}
