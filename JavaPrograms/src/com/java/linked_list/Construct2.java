package com.java.linked_list;

//Constructs and prints the list [3, 7, 12]. This version uses
//node constructors rather than setting fields of each node.
public class Construct2 {
	public static void main(String[] args) {
		ListNode list = new ListNode(3,new ListNode(7, new ListNode(12)));
		System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
	}
 }
