/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.dependencyInjectionAnnotated;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * The Class Blue.
 *
 * @author ARUP
 */
@Component
@Qualifier("blue")
public class Blue implements Color {

	/* (non-Javadoc)
	 * @see net.arup.spring.dependencyInjectionAnnotated.Color#fillColor()
	 */
	public void fillColor() {
		System.out.println("Color BLUE is filled.");

	}

}
