package com.languagefundamentals.methods;

public class Method2 {
	
	void addition() {
		System.out.println("Addition method Called!");
		int a = 20;
		int b = 10;
		System.out.println(a+b);
	}
	
	void subtraction() {
		System.out.println("subtraction method called!");
		int a = 20;
		int b = 10;
		System.out.println(a-b);
	}
	
	void modulus() {
		System.out.println("Modulus method called!");
		int a = 20;
		int b = 10;
		System.out.println(a%b);
	}
	
	void division() {
		System.out.println("division method called!");
		int a = 20;
		int b = 10;
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		Method2 m1 = new Method2();
		m1.addition();
		m1.subtraction();
		m1.modulus();
		
		System.out.println("Main method Ended!");

	}

}
