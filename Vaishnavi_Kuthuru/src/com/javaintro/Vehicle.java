package com.javaintro;

public class Vehicle {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalized method called");
	}
	
	void hello() {
		Vehicle v5 = new Vehicle();
		System.out.println("*****"+v5);
	}

	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle();
		Vehicle v3 = new Vehicle();
		
		v2 = null;//Nullifying the reference
		
		
		Vehicle v4 = new Vehicle();//Re-assigning Variables
		v3 = v4;
		v4.hello();
		System.gc();
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		System.out.println(v4);
		
	}

}
