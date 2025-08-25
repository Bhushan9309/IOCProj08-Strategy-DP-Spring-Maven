package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Dependent Class 3
@Component("pEngine")
@Lazy(true)

public final class PetrolEngine implements IEngine
{
	public PetrolEngine()
	{
		System.out.println("PetrolEngine : : 0-param Constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine : : Engine Started ");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine : : Engine Stopped");
		
	}

}
