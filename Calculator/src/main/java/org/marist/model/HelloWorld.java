package org.marist.model;

import java.io.FileNotFoundException;

import org.apache.log4j.Logger;

public class HelloWorld {

	private static Logger LOGGER = Logger.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {

		LOGGER.info("Welocme to Hello WOrld App");
		
		try {
			if(true){
				
				int a  = 10+20;
				LOGGER.debug("intermediate result of var a : " + a);
			}
			throw new Exception();
		}catch (Exception e) {
			LOGGER.error("Exception caught");
		}
		
		System.out.println("Hello");
		
	}

}
