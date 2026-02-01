package com.lambda.methodreference.nameuppercasing;

public class Employee
{
	String name;
	String department;
	double salary;
	
	Employee(String name,String department,double salary)
	{
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	
	public String getName()
	{
		return name;
	}	
	
	@Override
	public String toString()
	{
		return name + " ( "+ department + ",Rs. " + String.format("%2f", salary)+")";
	}
}
