package com.day1.employee;

import java.util.*;
import java.util.stream.Collectors;

public class Main 
{
	public static void main(String[] args)
	{

        List<Employee> list = Arrays.asList(
                new Employee(1, "Rahul", 25, "Male", "IT", 2018, 60000),
                new Employee(2, "Priya", 28, "Female", "HR", 2016, 55000),
                new Employee(3, "Amit", 30, "Male", "Sales", 2014, 70000),
                new Employee(4, "Sneha", 26, "Female", "Sales", 2019, 50000),
                new Employee(5, "Karan", 35, "Male", "HR", 2012, 80000)
        );

        // 🔹 Example 1: Print all employees
        System.out.println("All Employees:");
        list.forEach(System.out::println);
        
        //Count how many male and female employees are there in organisation
        Map<String,Long> countMaleAndFemaleEmployee = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        countMaleAndFemaleEmployee.forEach((gen, total) -> {
        	System.out.println("Gender : "+gen);
        	System.out.println("Total Employee : "+total);
        });
        
        //Print name of all departments
        List<String> nameOfDepartment = list.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println(nameOfDepartment);
        //nameOfEmployee.forEach(System.out::println);
        
        //Average age of male and female employees
        Map<String,Double> avgAge = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        avgAge.forEach((gen, age) ->
        {
        	System.out.println("Gender : "+gen);
        	System.out.println("Average age :"+age);
        });
        
        //Details of highest paid employee
        Optional<Employee> highestPaid = list.stream().max(Comparator.comparing(Employee::getSalary));
        highestPaid.ifPresent(System.out::println);
        
        //Names of all employee who joined after 2015
        List<String> joinedAfter2015 = list.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName).collect(Collectors.toList());
        System.out.println(joinedAfter2015);
        
        //Count no of Employees in each department
        Map<String,Long> noOfEmployee = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        noOfEmployee.forEach((dept,total) ->
        {
        	System.out.println("Department : "+ dept);
        	System.out.println("Total : "+ total);
        });	
        
        //Average salary in each department
        Map<String,Double> avgSalary = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        avgSalary.forEach((dept, avg) ->
        {
        	System.out.println("Department : "+ dept);
        	System.out.println("Average Salary : "+ avg);
        });
        
        //Youngest employee detail in product management department
        Optional<Employee> employeeDetails = list.stream().filter(e -> e.getDepartment().equalsIgnoreCase("HR")).min(Comparator.comparing(Employee::getAge));
        employeeDetails.ifPresent(System.out::println);
        
        //Most workingExpierence
        Optional<Employee> workingExpierence = list.stream().min(Comparator.comparing(Employee::getYearOfJoining));
        workingExpierence.ifPresent(System.out::println);
        
        //Male and female employee in sales team 
        Map<String,Long> countMember = list.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales")).collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        countMember.forEach((gen,count) ->
        {
        	System.out.println("Gender : "+gen);
        	System.out.println("Count : "+count);
        });
        
        //Average Salary of male and female employee
        Map<String,Double> avgSalaryOfG = list.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getSalary)));
        avgSalaryOfG.forEach((gen,sal) ->
        {
        	System.out.println("Gender : "+ gen);
        	System.out.println("Salary : "+ sal);
        });
        Map<String,List<String>> employeeName = list.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.mapping(Employee::getName,Collectors.toList())));
        employeeName.forEach((dept, names) ->
        {
        	System.out.println(dept +" : "+names);
        });
        //Average and total of the salary
       DoubleSummaryStatistics stats = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
       System.out.println("Total Salary : "+ stats.getSum());
       System.out.println("Average Salary : "+ stats.getAverage());
       
       //Whose salary  is more than 25 k
       List<Employee> salaryMoreThan25K = list.stream().filter(s -> s.getSalary() > 25000).collect(Collectors.toList());
       salaryMoreThan25K.forEach(System.out::println);
       //highest paid employee in the organization
       Optional<Employee> highestPaidEmployee = list.stream().max(Comparator.comparing(Employee::getSalary));
       highestPaidEmployee.ifPresent(System.out::println);
       //Second highest salary
       Optional<Employee> secondHighest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
       secondHighest.ifPresent(System.out::println);
       //Third Highest 
       Optional<Employee> thirdHighest = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst();
       thirdHighest.ifPresent(System.out::println);
       //lowest Salary
       Optional<Employee> lowestEmployee = list.stream().sorted(Comparator.comparing(Employee::getSalary)).findFirst();
       lowestEmployee.ifPresent(System.out::println);
       Optional<Employee> lowestSecond = list.stream().sorted(Comparator.comparing(Employee::getSalary)).skip(1).findFirst();
       //Second lowest
       lowestSecond.ifPresent(System.out::println);
       //Lowest five salaries
       List<Employee> lowestFiveEmployees = list.stream().sorted(Comparator.comparing(Employee::getSalary)).limit(5).collect(Collectors.toList());
       lowestFiveEmployees.forEach(System.out::println);
       //Highest five salaries
       List<Employee> highestFivEmployees = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(5).collect(Collectors.toList());
       highestFivEmployees.forEach(System.out::println);
       
   }
        
}
	