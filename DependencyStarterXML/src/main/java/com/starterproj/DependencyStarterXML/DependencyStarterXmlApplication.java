package com.starterproj.DependencyStarterXML;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*Demonstrates that the Bean A with the Singleton Scope gets new instance of
		Bean B everytime one is needed using LookUp Method */
/*Lookup method injection is the ability of the container to override methods on container-managed beans and return the lookup result
for another named bean in the container.*/
@SpringBootApplication
public class DependencyStarterXmlApplication {
	/* This is an example to demonstrate how method injection works using LookUp Method Injection */
	public static void main(String[] args) {

		SpringApplication.run(DependencyStarterXmlApplication.class, args);

		ApplicationContext a = new ClassPathXmlApplicationContext("sources.xml");

		Person p=a.getBean("per",Person.class);
		p.setName("Tom");
		p.getSalary(p.getName());

		/*Demonstrates dependency injection*/
		System.out.println(p.getName()+ " is Driving Car " + p.isDriving());

		/*Demonstrates that the Bean A with the Singleton Scope gets new instance of
		Bean B everytime one is needed using LookUp Method*/
		System.out.println("Look-Up Method invoked prototype Bean B 1st Time " + p.likesCar());
		System.out.println("Look-Up Method invoked prototype Bean B 2nd Time " + p.likesCar());

	}

}
