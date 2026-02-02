package com.languagefundamentals.methods;

//Abstract Method
interface In1{
	//Abstract methods do not specify a body
	public abstract void method1();
}

class Person{
//	final void hello() {
//		System.out.println("Hello Person!");
//	}
}

class Student extends Person{
	int sno;
	String sname;
	
	//Cannot override the final method from person
//	@Override
//	void hello() {
//		System.out.println("Hello Student!");
//	}
}

public class Method8 {
	
//	double getSalaryInfo(){
//		double sal = 100000;
//		return  sal;
//	}
	
	//Final Method
	Student getStudent() {
		Student s = new Student();
		s.sno = 18;
		s.sname = "Virat";
		return s;
	}
	public static void main(String[] args) {
		System.out.println("Main method Started!");
		Method8 m8 = new Method8();
		Student s1 = m8. getStudent();
		System.out.println(s1.sno);
		System.out.println(s1.sname);
		System.out.println("Main method ended!");
		

	}

}
