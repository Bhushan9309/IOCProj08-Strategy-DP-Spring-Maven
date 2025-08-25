package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Target Class
@Component("vehicle")
public final class Vehicle {
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	public Vehicle()
	{
		System.out.println("Vehicle : : 0 -param Constructor");
	}
	//business method
	public void journey(String startplace,String endplace)
	{ 
	     System.out.println("Journey Started at Place : "+startplace);	
	     engine.startEngine();
	     System.out.println("Journey is Going On");
	     engine.stopEngine();
	     System.out.println("Journey Stopped at Place : "+endplace);	
	     
	}

}
