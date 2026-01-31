package com.languagefundamentals.methods;

import java.util.Scanner;

public class Method5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name:");
		String Name = sc.nextLine();
		
		System.out.println("Enter your age:");
		int Age = sc.nextInt();
		
		System.out.println("Enter your Gender:");
		char Gender = sc.next().charAt(0);
		
		Method5 m = new Method5();
		m.getName(Name);
		m.getAge(Age);
		m.getGender(Gender);
		sc.close();
		
	}
	void getName(String Name ) {
		System.out.println("My Name is " + Name);
	}
	
	void getAge(int Age) {
		System.out.println("My age is " + Age);
	}
	
	void getGender(char Gender) {
		System.out.println("My gender is " + Gender);
	}
	

}
