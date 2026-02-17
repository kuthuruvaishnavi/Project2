package com.java.Practice;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int max = a;
		if(b > max) max = b;
		if(c > max) max = c;
		System.out.println(max);
		sc.close();
	}

}
