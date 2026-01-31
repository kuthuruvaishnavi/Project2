package com.languagefundamentals.methods;

import java.util.Scanner;

public class AgeProgram {

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		AgeProgram m = new AgeProgram();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		m.getAge(age);
		sc.close();
		System.out.println("Main Method Ended!");
	}
	void getAge(int age) {
		System.out.println("My age is " + age);
	}

}
