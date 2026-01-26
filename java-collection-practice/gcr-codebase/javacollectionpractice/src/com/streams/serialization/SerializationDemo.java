package com.streams.serialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class SerializationDemo 
{
	    private static final String FILE_NAME = "employees.ser";

	    public static void main(String[] args) {
	        List<Employee> employeeList = new ArrayList<>();
	        employeeList.add(new Employee(1, "John Doe", "IT", 75000));
	        employeeList.add(new Employee(2, "Jane Smith", "Finance", 82000));
	        employeeList.add(new Employee(3, "Mike Ross", "Legal", 95000));

	        // Step 1: Serialize the list
	        saveEmployees(employeeList);

	        // Step 2: Deserialize the list
	        List<Employee> retrievedList = loadEmployees();

	        // Step 3: Display results
	        if (retrievedList != null) {
	            System.out.println("Employees retrieved from file:");
	            retrievedList.forEach(System.out::println);
	        }
	    }

	    private static void saveEmployees(List<Employee> list) {
	        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
	            oos.writeObject(list);
	            System.out.println("Success: Data saved to " + FILE_NAME);
	        } catch (IOException e) {
	            System.err.println("Error saving data: " + e.getMessage());
	        }
	    }

	    @SuppressWarnings("unchecked")
	    private static List<Employee> loadEmployees() {
	        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
	            return (List<Employee>) ois.readObject();
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        } catch (ClassNotFoundException e) {
	            System.err.println("Class structure not found: " + e.getMessage());
	        }
	        return null;
	    }
}
