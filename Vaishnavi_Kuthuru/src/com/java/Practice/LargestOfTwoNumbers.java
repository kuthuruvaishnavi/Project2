package com.java.Practice;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a :");
		int a = sc.nextInt();
		
		System.out.println("Enter b :");
		int b = sc.nextInt();
		
		System.out.println(a  > b ? a : b);
		sc.close();

	}

}
