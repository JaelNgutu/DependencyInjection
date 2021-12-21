package com.example.dependency;

import com.example.dependency.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyApplication.class, args);

		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println("--Output based on profile");
		System.out.println(i18nController.sayHello());

		MyController myController = (MyController) context.getBean("myController"); //start bean name with small caps
		System.out.println("---primary bean");
		System.out.println(myController.sayHi());

		System.out.println("---property injection");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--setter injection");
		SetterInjectionController setterInjectionController = (SetterInjectionController) context.getBean("setterInjectionController");
		System.out.println(setterInjectionController.getGreeting());

		System.out.println("--constructor injection");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
