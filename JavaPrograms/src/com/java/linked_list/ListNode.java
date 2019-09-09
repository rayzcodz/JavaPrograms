package com.java.linked_list;

public class ListNode {
	
	public int data; // data stored in this node
	public ListNode next; // link to next node in the list
	
	 // post: constructs a node with data 0 and null link
	 public ListNode() {
		 //this(0, null);
		 this.data = 0;
		 this.next = null;
	 }
	
	 // post: constructs a node with given data and null link
	 public ListNode(int data) {
		 //this(data, null);
		 this.data = data;
		 this.next = null;
	 }
	
	 // post: constructs a node with given data and given link
	 public ListNode(int data, ListNode next) {
		 this.data = data;
		 this.next = next;
	 }

}
