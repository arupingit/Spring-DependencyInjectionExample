/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.dependencyInjection;

/**
 * The Class Student.
 *
 * @author ARUP
 */
public class Student {
	
	/** The shapes. */
	private Shapes shapes;
	
	/** The intrument. */
	private Instruments intrument;
	
	/**
	 * Instantiates a new student.
	 *
	 * @param intrument the intrument
	 */
	public Student(Instruments intrument){
		this.intrument = intrument;
	}

	/**
	 * Gets the shapes.
	 *
	 * @return the shapes
	 */
	public Shapes getShapes() {
		return shapes;
	}

	/**
	 * Sets the shapes.
	 *
	 * @param shapes the new shapes
	 */
	public void setShapes(Shapes shapes) {
		this.shapes = shapes;
	}
	
	/**
	 * Draw.
	 */
	public void draw(){
		shapes.draw();
	}
	
}
