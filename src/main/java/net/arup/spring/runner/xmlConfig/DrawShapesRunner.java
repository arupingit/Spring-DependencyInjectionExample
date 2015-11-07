/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.runner.xmlConfig;

import net.arup.spring.dependencyInjection.Student;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * The Class DrawShapesRunner.
 *
 * @author ARUP
 */
public class DrawShapesRunner {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"META-INF/spring/bean-config.xml");
		context.registerShutdownHook();
		Student student = (Student) context.getBean("student");
		student.draw();

	}

}
