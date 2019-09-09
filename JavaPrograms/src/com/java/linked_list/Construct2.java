package com.java.linked_list;

//	Constructs and prints the list [3, 7, 12]. This version uses
//	node constructors rather than setting fields of each node.
public class Construct2 {
	public static void main(String[] args) {
		ListNode list = new ListNode(3,new ListNode(7, new ListNode(12)));
		
//		Below option won't work. We have to create it like above line.
		
//		ListNode list = new ListNode(3,new ListNode());
//		list = new ListNode(7,new ListNode());
//		list = new ListNode(12,null);


//		As you have guessed printing nodes like this below is very tedious. We will print nodes
//		using loops.
		System.out.println("Printing without loops!");
		System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
		
		
//		Printing nodes using loops.
		
		System.out.println("Printing using while loop!");
		ListNode current = list;
		
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		
		System.out.println("Printing using for loop!");
		
		for(ListNode curr = list; curr != null; curr= curr.next) {
			System.out.println(curr.data);
		}

		
	}
 }
