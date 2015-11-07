/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.dependencyInjectionAnnotated;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * The Class Red.
 *
 * @author ARUP
 */
@Component
@Qualifier("red")
public class Red implements Color {

	/* (non-Javadoc)
	 * @see net.arup.spring.dependencyInjectionAnnotated.Color#fillColor()
	 */
	public void fillColor() {
		System.out.println("Color RED is filled");
	}

}
