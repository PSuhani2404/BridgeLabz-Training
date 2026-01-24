package com.javacollections.listinterface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ReverseList 
{

		// Two pointers (O(n) time, O(1) extra space)
		public static void reverseList(List<Integer> list)
		{
			int left = 0;
			int right = list.size() - 1;

			while (left < right)
			{
				// Swap elements at left and right positions
				Integer temp = list.get(left);
				list.set(left, list.get(right));
				list.set(right, temp);

				left++;
				right--;
			}
		}

		public static void main(String[] args) 
		{
			// ArrayList
			System.out.println("=== ArrayList ===");
			List<Integer> arrayList = new ArrayList<>();
			for (int i = 1; i <= 6; i++) 
			{
				arrayList.add(i);
			}

			System.out.println("Original ArrayList : " + arrayList);

			reverseList(arrayList);
			System.out.println("Reversed ArrayList : " + arrayList);

			System.out.println();

			// LinkedList
			System.out.println("=== LinkedList ===");
			List<Integer> linkedList = new LinkedList<>();
			for (int i = 10; i <= 15; i++) 
			{
				linkedList.add(i);
			}

			System.out.println("Original LinkedList : " + linkedList);

			reverseList(linkedList);
			System.out.println("Reversed LinkedList  : " + linkedList);

			System.out.println();
	

		}
	}