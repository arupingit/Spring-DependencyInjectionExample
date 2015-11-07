/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.runner.xmlConfig;

import net.arup.spring.dependencyInjection.Student;
import net.arup.spring.dependencyInjectionAnnotated.Student2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Class FillColorRunner.
 *
 * @author ARUP
 */
public class FillColorRunner {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"META-INF/spring/bean-config-autowire.xml");
		context.registerShutdownHook();
		Student2 student2 = (Student2) context.getBean("student2");
		student2.fillColor();

	}

}
