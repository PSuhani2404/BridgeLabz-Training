package com.lambda.lambdaexpression.smarthome;
@FunctionalInterface
public interface LightStrategy 
{
	void execute(String lightName);
}
