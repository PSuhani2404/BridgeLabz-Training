package com.javacollections.queue;
import java.util.PriorityQueue;
public class HospitalTriageSystem 
{
		public static void main(String[] args) 
		{
			PriorityQueue<Patient> pq = new PriorityQueue<Patient>((a, b) -> b.priority - a.priority);
			
			pq.add(new Patient("Riya", 5));
			pq.add(new Patient("Adi", 1));
			pq.add(new Patient("Suhani", 3));
			pq.add(new Patient("Avi", 2));
			
			while(!pq.isEmpty())
			{
				System.out.println(pq.remove());
			}
		}
}
	class Patient
	{
		String name;
		int priority;
		
		public Patient(String name, int priority)
		{
			this.name = name;
			this.priority = priority;
		}
		
		public String toString() {
			return name + " " + priority;
		}
}


