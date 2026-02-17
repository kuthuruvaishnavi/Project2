package com.java.Practice;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a :");
		int a = sc.nextInt(),  b = sc.nextInt();
		
//		System.out.println("Enter b :");
//		int b = sc.nextInt();
		
		System.out.println("Sum :" + (a + b));
		sc.close();

	}

}
