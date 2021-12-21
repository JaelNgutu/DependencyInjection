package com.example.dependency;

import com.example.dependency.controllers.ConstructorInjectedController;
import com.example.dependency.controllers.MyController;
import com.example.dependency.controllers.PropertyInjectedController;
import com.example.dependency.controllers.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DependencyApplication.class, args);
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
