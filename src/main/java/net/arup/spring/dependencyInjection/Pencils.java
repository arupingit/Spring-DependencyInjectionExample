/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.dependencyInjection;

/**
 * The Class Pencils.
 *
 * @author ARUP
 */
public class Pencils implements Instruments {

	/* (non-Javadoc)
	 * @see net.arup.spring.dependencyInjection.Instruments#getIntruments()
	 */
	public void getIntruments() {
		System.out.println("pencils are ready");

	}

	/* (non-Javadoc)
	 * @see net.arup.spring.dependencyInjection.Instruments#putInstrumentsBack()
	 */
	public void putInstrumentsBack() {
		System.out.println("pencils are kept back to its place");		
	}

}
