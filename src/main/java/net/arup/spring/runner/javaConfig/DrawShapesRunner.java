/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.runner.javaConfig;

import net.arup.spring.dependencyInjection.Shapes;
import net.arup.spring.dependencyInjection.Student;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfig.class);
		context.registerShutdownHook();
		Student student = (Student) context.getBean("getStudentbean");
		student.draw();
	}

}
