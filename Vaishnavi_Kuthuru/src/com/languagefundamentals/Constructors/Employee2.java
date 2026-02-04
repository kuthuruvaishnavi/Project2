package com.languagefundamentals.Constructors;

public class Employee2 {

	int eid;
	String ename;
	double salary;
	int age;

	//Constructor -1
	Employee2() { //These are the values which are default given by the developer
		System.out.println("no arg Constructor called");
		eid = 100;
		ename = "Shiva";
		salary = 100000.00;
		age = 28;
	}
	//Constructor -2
	Employee2(int eid) {
		System.out.println("one arg constructor called");
		this();//Calling no arg constructor
		this.eid = eid;
	}
	//Constructor -3
	Employee2(int eid, String ename) {
		this(eid);
		System.out.println("two arg Contructor called");
		this.ename = ename;
	}
	//Constructor -4
	Employee2(int eid, String ename, double salary) {
		this(eid,ename);
		System.out.println("three arg Constructor called");
		this.salary = salary;
	}
	//Constructor -5
	Employee2(int eid, String ename, double salary, int age) {
		this(eid,ename,salary);
		System.out.println("Four arg Constructor called");
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		Employee2 e1 = new Employee2();
		e1.display();

		Employee2 e2 = new Employee2(101);
		e2.display();

		Employee2 e3 = new Employee2(102, "Vaishu");
		e3.display();

		Employee2 e4 = new Employee2(103, "Lokesh", 10000.00);
		e4.display();

		Employee2 e5 = new Employee2(104, "Hanuman" ,100000.00, 24);
		e5.display();

	}

	void display() {
		System.out.println("******************");
		System.out.println("Employee Id :" + eid);
		System.out.println("Employee name :" + ename);
		System.out.println("Employee Salary :" + salary);
		System.out.println("Employee age :" + age);
	}

}