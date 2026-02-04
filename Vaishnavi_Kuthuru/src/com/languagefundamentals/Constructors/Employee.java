package com.languagefundamentals.Constructors;

public class Employee {

	int eid;
	String ename;
	double salary;
	int age;

	//Constructor -1
	Employee() { //These are the values which are default given by the developer
		System.out.println("no arg Constructor");
		eid = 100;
		ename = "Shiva";
		salary = 100000.00;
		age = 28;
	}
	//Constructor -2
	Employee(int eid) {
		System.out.println("one arg constructor called");
		this.eid = eid;
	}
	//Constructor -3
	Employee(int eid, String ename) {
		System.out.println("two arg Contructor called");
		this.eid = eid;
		this.ename = ename;
	}
	//Constructor -4
	Employee(int eid, String ename, double salary) {
		System.out.println("three arg Constructor called");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}
	//Constructor -5
	Employee(int eid, String ename, double salary, int age) {
		System.out.println("Four arg Constructor called");
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.age = age;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");

		Employee e1 = new Employee();
		e1.display();

		Employee e2 = new Employee(101);
		e2.display();

		Employee e3 = new Employee(102, "Vaishu");
		e3.display();

		Employee e4 = new Employee(103, "Lokesh", 10000.00);
		e4.display();

		Employee e5 = new Employee(104, "Hanuman", 1000000.00, 100);
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
