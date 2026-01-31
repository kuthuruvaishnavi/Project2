package com.languagefundamentals.methods;

import java.util.Scanner;

//WAP to print about you,by using methods and scanners
public class Method4 {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Method4 m = new Method4();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String fname = s.next();
		
		System.out.println("Enter your last name :");
		String lname = s.next();
		
		//Calling method by passing the values : Call by values
		m.getName(fname, lname);
		s.close();
		System.out.println("Main method ended!");
		
	}
	void getName(String fname, String lname) {
		String fullName = fname + " " + lname;
		System.out.println("My Full Name is :" + fullName);
	}

}
