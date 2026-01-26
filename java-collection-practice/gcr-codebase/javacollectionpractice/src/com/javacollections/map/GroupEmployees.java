package com.javacollections.map;
import java.util.*;
public class GroupEmployees 
{
	public static void main(String[] args)
	{
			ArrayList<Employee> list = new ArrayList<>();
			list.add(new Employee("Aditya", "HR"));
			list.add(new Employee("Tanishtha", "HR"));
			list.add(new Employee("Arya", "IT"));
			list.add(new Employee("Ravi", "MR"));
			
			HashMap<String, List<Employee>> mp = new HashMap<>();
			
			for(Employee employee : list) 
			{
				String dept = employee.department;
				if(!mp.containsKey(dept)) mp.put(dept, new ArrayList<Employee>());
				mp.get(dept).add(employee);
			}
			System.out.println(mp);
		}
	}

	class Employee 
	{
		String name;
		String department;
		
		public Employee(String name, String department) 
		{
			this.name = name;
			this.department = department;
		}
		
		public String toString() {
			return name + " " + department;
		}
}
