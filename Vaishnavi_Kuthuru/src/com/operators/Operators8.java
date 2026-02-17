package com.operators;

//Ternary Operators : -> , ? , :
// Syntax : (condition) ? str1 : str2 
public class Operators8 {

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		
		int a1 = 20;
		int b1 = 30;
		int c1 = 40;
		int max2 = 0;
		
		max2 = (a1 > b1) ? (a1 < c1 ? a1 : c1) : (b1 > c1 ? b1 :c1);
		System.out.println(max2);
		
		int a = 10;
		int b = 20;
		int max = 0;
		
		max = (a > b) ? a : b;
		System.out.println(max);
		
	//	System.out.println(a > b ? a : b);
		
		String s1 = "vaishu";
		String s2 = "java";
		String max1 = "";
		
		max1 = (s1.length() > s2.length() ? s1 : s2);	
		System.out.println(max1);
		
		System.out.println(s1.length() > s2.length() ? s1.length() : s2.length() );
		
		

	}

}
