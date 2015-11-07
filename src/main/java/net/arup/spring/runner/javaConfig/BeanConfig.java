/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.runner.javaConfig;

import net.arup.spring.dependencyInjection.Circle;
import net.arup.spring.dependencyInjection.Instruments;
import net.arup.spring.dependencyInjection.Pencils;
import net.arup.spring.dependencyInjection.Shapes;
import net.arup.spring.dependencyInjection.Square;
import net.arup.spring.dependencyInjection.Student;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The Class BeanConfig.
 */
@Configuration
public class BeanConfig {
	
	/**
	 * Gets the studentbean.
	 *
	 * @return the studentbean
	 */
	@Bean
	Student getStudentbean(){
		Student student =  new Student(getPencils());
		student.setShapes(getCircleBean());
		return student;
	}
	
	/**
	 * Gets the circle bean.
	 *
	 * @return the circle bean
	 */
	@Bean
	Shapes getCircleBean(){
		return new Circle();
	}
	
	/**
	 * Gets the square bean.
	 *
	 * @return the square bean
	 */
	@Bean
	Shapes getSquareBean(){
		return new Square();
	}

	/**
	 * Gets the pencils.
	 *
	 * @return the pencils
	 */
	@Bean(initMethod="getIntruments",destroyMethod="putInstrumentsBack")
	Instruments getPencils(){
		return new Pencils();
	}
}
