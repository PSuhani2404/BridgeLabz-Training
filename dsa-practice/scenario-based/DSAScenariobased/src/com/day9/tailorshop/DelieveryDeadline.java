package com.day9.tailorshop;
import java.util.*;
/*9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting*/ 
public class DelieveryDeadline 
{
	public static void setOrders(int[] deadline)
	{

		for(int i = 1; i < deadline.length; i++)
		{
			int temp = deadline[i];
			int j = i - 1;
			while( j >= 0 && deadline[j] > temp)
			{
				deadline[j+1] = deadline[j];
				j = j - 1;
			}
			deadline[j+1] = temp;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] deadline = { 12, 7, 5, 3, 24, 30, 2, 17};
		System.out.println("Deadline before sorting :" +Arrays.toString(deadline));
		setOrders(deadline);
		System.out.print("Deadline after sorting :" +Arrays.toString(deadline));
	}
}
