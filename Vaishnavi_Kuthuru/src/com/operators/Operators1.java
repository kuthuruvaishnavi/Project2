package com.operators;

import java.util.Scanner;

//Arithmetic Operators: +,-,*,%,/ :
public class Operators1 
	{
	public static void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter b number : ");
		int b = sc.nextInt();
		
		System.out.println("Addition : " + (a + b));
		System.out.println("Subtraction : " + (a - b));
		System.out.println("Multiplication : " + (a * b));
		System.out.println("Quotiont : " + (a % b));
		System.out.println("Remainder : " + (a / b));
		sc.close();
	}
}
