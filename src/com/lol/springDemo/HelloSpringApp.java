package com.lol.springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

class HelloSpringApp {

	public static void main(String[] args) {
		
		//load Spring configurationFile
		ClassPathXmlApplicationContext context=
		new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve bean
		Coach theCoach= context.getBean("myCoach", Coach.class);
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortune());
		//close the context
		
		CricketCoach secondCoach=context.getBean("myCricketCoach",CricketCoach.class);
		System.out.println(secondCoach.getDailyWorkout());
		System.out.println(secondCoach.getFortune());
		System.out.println(secondCoach.getEmailAddress());
		System.out.println(secondCoach.getTeam());
		context.close();
	}

}
