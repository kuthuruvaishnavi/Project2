package com.javaintro;

public class Customer {
	int cid ;
	String cname;
	
	void welcome() {
		System.out.println("Welcome started");
		Customer c = new Customer();
		System.out.println("welcome ended");
	}
	
	protected void finalize() {
		System.out.println("finalize called!");
	}

	public static void main(String[] args) {
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		
		
		
//1) Nullifying the objects		
//		c1 = null;
//      c2 = null;
//      c3 = null;

//2) Re- Assigning the objects
//		Customer c4 = new Customer();
//		c1 = c2;

//3) Objects inside the methods
		c1.welcome();
		
//4) anonymous objects
		
		new Customer();
		
		System.gc();
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
