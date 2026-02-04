package com.languagefundamentals.Constructors;

//Super or Base or Parent Class
class Vehicle {

	String Name = "Tata";
	String Model;
	String Brand;
	double Price;
	
	//This block runs directly main method because it is Static
	static {
		System.out.println("Hello this is static from vehicle!");
	}

	public static void main(String[] args) {
		System.out.println("Main method Started from Vehicle !!");

	}
	void hi() {
		System.out.println("Hi Vaishhnavi");
	}
}

//Sub or Derived or Child class
public class Bike extends Vehicle {
	String Name = "Vaishu- Tata";

	public static void main(String[] args) {
		System.out.println("Main method started from Bike!!");
		
		Bike b1 = new Bike();
		b1.show();
		
		System.out.println("Main method ended!");

	}
	void show() {
		System.out.println(Model);
		System.out.println(Brand);
		System.out.println(Price);
		System.out.println(super.Name);
		System.out.println(this.Name);
		super.hi();
		
	}
	
}