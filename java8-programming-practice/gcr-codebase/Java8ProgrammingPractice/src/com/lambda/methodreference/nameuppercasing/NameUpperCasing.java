package com.lambda.methodreference.nameuppercasing;
import java.util.ArrayList;
import java.util.List;
public class NameUpperCasing 
{
	public static void main(String[] args)
	{
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Suhani Pawar","Engineering",85000.0));
		employees.add(new Employee("Aditya Singh","Marketing",800000.0));
		employees.add(new Employee("Tanishtha yadav","Finance",600000.0));
		employees.add(new Employee("Sneha Gupta","HR",500000.0));
		employees.add(new Employee("Vikram Singh","Operation",400000.0));
		System.out.println("HR Letter Preparation - Employee name in upperCase");
		System.out.println("-------------------------------------------");
		
		//Using method reference
		employees.stream()
		.map(emp -> emp.getName())// get name
        .map(String::toUpperCase) // method reference
        .forEach(System.out::println); // print each uppercase name
		
		 System.out.println("--------------------------------------------------");
	        System.out.println("Total employees: " + employees.size());
	}

}
