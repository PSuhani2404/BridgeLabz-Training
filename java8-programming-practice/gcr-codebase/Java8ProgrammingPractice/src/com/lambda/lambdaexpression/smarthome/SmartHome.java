package com.lambda.lambdaexpression.smarthome;

public class SmartHome 
{
	public static void activateLight(String name,LightStrategy strategy)
	{
		System.out.print("Triggering " +name+ "->");
		strategy.execute(name);
	}
	
	public static void main(String[] args)
	{
		LightStrategy motionTrigger = (light) -> System.out.println("Flashing! bright white due to movement");
		
		LightStrategy nightMode = (light) -> System.out.println("Setting to 5% brightness,warm yellow");
		
		LightStrategy partyMode = (light) -> System.out.println("Cycling through RGB colours");
		
		activateLight("Front porch",motionTrigger);
		activateLight("Bedroom",nightMode);
		activateLight("Living Room",partyMode);
		
	}

}
