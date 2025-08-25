package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Dependent Class 2
@Component("eEngine")
@Lazy(true)
public final  class ElectricEngine  implements IEngine
{
	public ElectricEngine()
	{
		System.out.println("ElectricEngine : : 0-param Constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("ElectricEngine : : Engine Started ");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("ElectricEngine : : Engine Stopped");
		
	}

}
