package com.starterproj.DependencyStarterXML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DependencyStarterXmlApplication {
	/* This is an example to demonstrate how dependency works in Spring Based application using XML File */
	public static void main(String[] args) {

		SpringApplication.run(DependencyStarterXmlApplication.class, args);
		ApplicationContext a = new ClassPathXmlApplicationContext("sources.xml");

		Person p=a.getBean("per",Person.class);
		p.setName("Tom");
		System.out.println("Name of the Person is " + p.getName());

		Car c = a.getBean("car",Car.class);
		c.setName("Bugati");
		System.out.println("Name of the car is  " + c.getName() +" ");

		c.getDriverName();

	}

}
