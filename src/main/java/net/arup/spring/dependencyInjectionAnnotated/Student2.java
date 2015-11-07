/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.dependencyInjectionAnnotated;

import net.arup.spring.dependencyInjection.Instruments;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * The Class Student2.
 */
@Component("student2")
public class Student2 {

	/** The color. */
	@Autowired
	@Qualifier("red")
	Color color;
	
	/** The intrument. */
	private Instruments intrument;
	
	/**
	 * Instantiates a new student2.
	 *
	 * @param intrument the intrument
	 */
	@Autowired
	Student2(Instruments intrument){
		this.intrument = intrument;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(Color color) {
		this.color = color;
	}
	
	/**
	 * Fill color.
	 */
	public void fillColor(){
		color.fillColor();
	}
		
}
