package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Target Class
@Component("vehicle")
public final class Vehicle {
	
	//@Qualifier("pEngine")
	//@Qualifier("${engg.id}")  --invalid because place holder ${....} can not be used with out @Value
	//@Qualifier("@Value('${engine.id}')") --invalid because @Value annotation can be placed in @Qualifier(--) annotation
	/*@Value("${engine.id}")
	private String id;
	*/
	@Autowired //Field Injection
	//@Qualifier("id")  //invalid becoz we can not pass variable name inside the @Qualifier(--)
	@Qualifier("motor")
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
