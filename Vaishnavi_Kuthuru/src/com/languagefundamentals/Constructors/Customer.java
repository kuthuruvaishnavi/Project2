package com.languagefundamentals.Constructors;


class person {
	
	String Name;
	public person(String name) {
		super();
		Name = name;
	}
	public person() {
		System.out.println("no arg constructor called from person");
	}
	
}

public class Customer extends person {
	
	int id;
	String city;
	
	public Customer() {
		System.out.println("no arg Constructor called!");
	}
	

	public Customer(int id, String city) {
		System.out.println("Parametorized constructor called!");
		this.id = id;
		this.city = city;
	}
	
	public Customer(int id, String city, double salary) {
		System.out.println("Three arg constructor");
		this.id = id;
		this.city = city;
	//	this.salary = salary;
	}
	public Customer(int id) {
		System.out.println("One arg constructor called");
		this.id = id;
	}


	public static void main(String[] args) {
		System.out.println("Main method started");
		
		Customer c1 = new Customer(1,"Hyd");
		c1.show();
		
		Customer c2 = new Customer();
		c2.show();
		
		Customer c3 = new Customer(2,"kakinada");
		c3.show();
		
		Customer c4 = new Customer(3);
		c4.show();
		
		Customer c5 = new Customer(4,"vizag", 10000);
		c5.show();
	}
	void show() {
		System.out.println("id :" + id);
		System.out.println("city : " + city);
	}

}
