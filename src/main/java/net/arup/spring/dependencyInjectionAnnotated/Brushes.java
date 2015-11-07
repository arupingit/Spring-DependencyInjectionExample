/*
 * Copyright arupingit(Arup Dutta) 
 * github profile url  https://github.com/arupingit
 * 
 */
package net.arup.spring.dependencyInjectionAnnotated;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import net.arup.spring.dependencyInjection.Instruments;

/**
 * The Class Brushes.
 *
 * @author ARUP
 */
@Component
public class Brushes implements Instruments {

	/* (non-Javadoc)
	 * @see net.arup.spring.dependencyInjection.Instruments#getIntruments()
	 */
	@PostConstruct
	public void getIntruments() {
		System.out.println("brushes are ready");

	}
	
	/* (non-Javadoc)
	 * @see net.arup.spring.dependencyInjection.Instruments#putInstrumentsBack()
	 */
	@PreDestroy
	public void putInstrumentsBack() {
		System.out.println("brushes are kept back to its place");		
	}

}
