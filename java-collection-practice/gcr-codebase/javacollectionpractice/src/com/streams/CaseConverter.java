package com.streams;
import java.io.*;
import java.nio.charset.StandardCharsets;
public class CaseConverter 
{
	    public static void main(String[] args) {
	        // Define file paths
	        File inputFile = new File("input.txt");
	        File outputFile = new File("output.txt");

	        // Step 1: Create a dummy input file for demonstration (Optional)
	        prepareInputFile(inputFile, "HELLO World! This IS a TEST File.");

	        // Step 2: Process the file
	        convertFileToLowercase(inputFile, outputFile);
	    }

	    private static void convertFileToLowercase(File input, File output) {
	        // Using try-with-resources for automatic closure and specifying UTF-8
	        try (
	            BufferedReader reader = new BufferedReader(new FileReader(input, StandardCharsets.UTF_8));
	            BufferedWriter writer = new BufferedWriter(new FileWriter(output, StandardCharsets.UTF_8))
	        ) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                // Convert line to lowercase and write
	                writer.write(line.toLowerCase());
	                // Add a new line to match the original structure
	                writer.newLine();
	            }
	            System.out.println("Processing complete. Check 'output.txt' for results.");

	        } catch (FileNotFoundException e) {
	            System.err.println("Error: The source file was not found.");
	        } catch (IOException e) {
	            System.err.println("Error reading/writing files: " + e.getMessage());
	        }
	    }

	    private static void prepareInputFile(File file, String content) {
	        try (FileWriter fw = new FileWriter(file)) {
	            fw.write(content);
	        } catch (IOException e) {
	            System.err.println("Setup error: " + e.getMessage());
	        }
	    }
}
