package com.javacollections.listinterface;

public class FindNthFromEnd 
{
	 static class Node 
	 {
	        int data;
	        Node next;

	        public Node(int data) 
	        {
	            this.data = data;
	            this.next = null;
	        }
	 }

	 static Node getNthFromEnd(Node head, int n) 
	 {
	        if (head == null || n <= 0) 
	        {
	            return null;
	        }

	        Node fast = head;
	        Node slow = head;

	     
	        for (int i = 0; i < n; i++)
	        {
	            if (fast == null)
	            {
	                return null; 
	            }
	            fast = fast.next;
	        }

	        while (fast != null)
	        {
	            fast = fast.next;
	            slow = slow.next;
	        }

	        return slow;
	    }

	    public static void main(String[] args) 
	    {

	        Node head = new Node(0);
	        head.next = new Node(1);
	        head.next.next = new Node(2);
	        head.next.next.next = new Node(3);
	        head.next.next.next.next = new Node(4);

	        int n = 3;
	        Node result = getNthFromEnd(head, n);

	        if (result != null) {
	            System.out.println("Nth node from end is: " + result.data);
	        } else {
	            System.out.println("Invalid value of n");
	        }
	    }
}


