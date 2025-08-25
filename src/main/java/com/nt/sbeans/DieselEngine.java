package com.nt.sbeans;


import org.springframework.stereotype.Component;

//Dependent Class 1
@Component("dEngine")

public final class DieselEngine implements IEngine
{
     public DieselEngine()
     {
    	 System.out.println("DieselEngine : : 0- param constructor ");
     }
	@Override
	public void startEngine()
	{
		System.out.println("DieselEngine : : Engine Started");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("DieselEngine : : Engine Stopped");
		
	}

}
