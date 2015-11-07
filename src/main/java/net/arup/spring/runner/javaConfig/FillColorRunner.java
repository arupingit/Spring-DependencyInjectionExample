/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.runner.javaConfig;


import net.arup.spring.dependencyInjectionAnnotated.Student2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(BeanConfigAutowire.class);
		context.registerShutdownHook();
		Student2 student2 = (Student2) context.getBean("student2");
		student2.fillColor();
	}

}
