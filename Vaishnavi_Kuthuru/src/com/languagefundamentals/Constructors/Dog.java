package com.languagefundamentals.Constructors;

class Animal{
	String name;
	int age;
	String breed;
	
	public Animal(){
		System.out.println("Animal no arg constructor Called");
	}
	public Animal(String name,int age,String breed) {
		System.out.println("Animal parameterized constructor called");
		this();
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	public static void main(String[] args) {
		System.out.println("Main method started from Animal");
	}
}

public class Dog extends Animal {
	Dog(){
		super("Tommy",5,"GS");// here It is directly calling super class i.e Animal class (it gives output for every object)
		System.out.println("Dog No arg constructor Called");
	}
	
	public static void main(String[] args) {
		System.out.println("Main method Started from dog");
		
		Dog d1 = new Dog();
		d1.show();
		
	//	Dog d2 = new Dog("Tommy",5,"GS");
	//	d2.show();	
		
		System.out.println("Main method Ended");
	}
	
	void show() {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
		System.out.println("Breed : " + breed);
	}

}
