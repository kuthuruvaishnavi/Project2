package com.languagefundamentals.methods;

public class Methods1 {
	
	void show() {
		System.out.println("Show your ID Card!");
	}

	public static void main(String[] args) {
		System.out.println("Main method Started!");
	
		
		welcome();//Calling static method
		//Static methods can be called directly
		Methods1.welcome();//static method can also be called using class name
		
		//To call instance method we need to create an object load instance method
		Methods1 m1 = new Methods1();//creating an object
		m1.show();//calling using reference variable
		
		Methods1 m2 = new Methods1();
		m2.show();
		
		
		Methods1 m3 = new Methods1();
		m3.show();
		
		System.out.println("Main method Ended!");

	}
	
	public static void welcome(){		
		System.out.println("Welcome to java");
	}

}
