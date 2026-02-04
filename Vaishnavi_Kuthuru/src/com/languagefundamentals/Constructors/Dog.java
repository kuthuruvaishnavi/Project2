package com.languagefundamentals.Constructors;

class Animal{
	
	Animal(){
		System.out.println("Animal no arg constructor Called");
	}
	public static void main(String[] args) {
		System.out.println("Main method started from Animal");
	}
}

public class Dog extends Animal {
	Dog(){
		super(); //It is directly calling super class i.e Animal class
		System.out.println("Dog No arg constructor Called");
	}
	public static void main(String[] args) {
		System.out.println("Main method Started");
		
		Dog d1 = new Dog();
	}

}
