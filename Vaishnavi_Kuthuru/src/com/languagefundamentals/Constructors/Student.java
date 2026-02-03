package com.languagefundamentals.Constructors;

public class Student {
	
	int Sid;
	String Sname;
	int age;
	
	//no argument constructor 
	Student(){
		System.out.println("no arg constructor called!");
		Sid = 101;
		Sname = "UnKnown";
		age = 20;		
	}
	
	//Parameterized Constructor
	Student(int Sid, String Sname, int age){
		System.out.println("Parameterized Constructor called!");
		
		this.Sid = Sid;
		this.Sname = Sname;
		this.age = age;
	}
	

	public static void main(String[] args) {
		System.out.println("Main Method Started!");
		
		//the below object is created with the help of default constructor
		//the below object is created with the help of no argument Constructor,because we already created another Student no arg Constructor 
		
		System.out.println("*************");
		Student s = new Student();
		s.show();
		
		System.out.println("*************");
		Student s1 = new Student();
		s1.Sid = 102;
		s1.Sname = "vaishu";
		s1.age = 21;
		s1.show();

	
		
		System.out.println("*************");
		Student s2 = new Student(103,"Revan",23);
		s2.show();
		
		
		System.out.println("*************");
		//we can also call directly with the method without a reference object
	//	System.out.println(new Student().Sid);
		
		
		System.out.println("Main method Ended!");

	}
	void show() {
		System.out.println("Void method called!");
		System.out.println(Sid);
		System.out.println(Sname);
		System.out.println(age);
		
	}
	

}
