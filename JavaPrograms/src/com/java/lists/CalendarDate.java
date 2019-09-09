package com.java.lists;

/*
 * Our goal is to list birthdays (M, D i.e 5, 1; 10, 2; 3, 4) format 
 * in ascending order. In order to do that We will create a CalendarDate class
 * which implements Comparable interface, and which implements the compareTo method of the 
 * Comparable interface.
 * 
 */


public class CalendarDate implements Comparable<CalendarDate> {

	private int month;
	private int day;
	
	
	public CalendarDate(int month, int day) {
		this.month = month;
		this.day = day;
	}
	
	
	
	
	// Compares this calendar date to another date.
	// Dates are compared by month and then by day.
	@Override
	public int compareTo(CalendarDate o) {
		if(month != o.month) {
			return month - o.month;
		} else {
			return day - o.day;
		}
	}
	
//	public int getMonth() {
//		return month;
//	}
//	
//	public int getDay() {
//		return day;
//	}
	
	@Override
	public String toString() {
		return month + "/" + day;
	}

}
