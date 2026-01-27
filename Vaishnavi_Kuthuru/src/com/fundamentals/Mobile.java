package com.fundamentals;

public class Mobile {
	
	long mobile_no = 9392169764L;
	String network = "jio";

	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		Mobile m = new Mobile();
		System.out.println(m.mobile_no);
		System.out.println(m.network);
		
		
		System.out.println("Main method ended");

	}

}
