package com.streams;
import java.io.*;
public class EfficientFileCopy 
{
	    private static final String SOURCE = "large_file.dat";
	    private static final String DEST_UNBUFFERED = "copy_unbuffered.dat";
	    private static final String DEST_BUFFERED = "copy_buffered.dat";
	    private static final int BUFFER_SIZE = 4096; // 4 KB

	    public static void main(String[] args) {
	        // Step 0: Ensure a large file exists for the test
	        createLargeFile(SOURCE, 100); // 100 MB

	        System.out.println("Starting performance test...\n");

	        // Test 1: Unbuffered Copy
	        long timeUnbuffered = copyUnbuffered(SOURCE, DEST_UNBUFFERED);
	        System.out.printf("Unbuffered Copy Time: %.2f ms%n", timeUnbuffered / 1_000_000.0);

	        // Test 2: Buffered Copy
	        long timeBuffered = copyBuffered(SOURCE, DEST_BUFFERED);
	        System.out.printf("Buffered Copy Time:   %.2f ms%n", timeBuffered / 1_000_000.0);
	        
	        // Performance Improvement Calculation
	        double improvement = (double) timeUnbuffered / timeBuffered;
	        System.out.printf("%nBuffered streams are approx. %.1fx faster!%n", improvement);
	    }

	    private static long copyUnbuffered(String src, String dest) {
	        long start = System.nanoTime();
	        try (FileInputStream fis = new FileInputStream(src);
	             FileOutputStream fos = new FileOutputStream(dest)) {
	            int b;
	            while ((b = fis.read()) != -1) {
	                fos.write(b);
	            }
	        } catch (IOException e) { e.printStackTrace(); }
	        return System.nanoTime() - start;
	    }

	    private static long copyBuffered(String src, String dest) {
	        long start = System.nanoTime();
	        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
	             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {
	            
	            byte[] buffer = new byte[BUFFER_SIZE];
	            int bytesRead;
	            while ((bytesRead = bis.read(buffer)) != -1) {
	                bos.write(buffer, 0, bytesRead);
	            }
	            bos.flush(); // Ensure all data is written
	        } catch (IOException e) { e.printStackTrace(); }
	        return System.nanoTime() - start;
	    }

	    private static void createLargeFile(String name, int mb) {
	        try (FileOutputStream fos = new FileOutputStream(name)) {
	            byte[] data = new byte[1024]; // 1KB junk data
	            for (int i = 0; i < mb * 1024; i++) {
	                fos.write(data);
	            }
	        } catch (IOException e) { e.printStackTrace(); }
	    }
}	
