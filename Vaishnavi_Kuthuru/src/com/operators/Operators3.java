package com.operators;

//Comparison or relational operators : ==, < , <= , >, >= , != 
//The output will be as a Boolean Expression 

public class Operators3 {

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 10;
		boolean status = false;
		boolean flag = true;
		
		System.out.println("**********");
		String s1 = "Vaishu";
		String s2 = "Vaishu";
		System.out.println(s1 == s2);//true
		
		System.out.println("**********");
		String s3 = new String("Vaishnavi");
		String s4 = new String("vaishnavi");
		System.out.println(s3 == s4);//false because both the addresses are different if the new object is created it checks for the address
		//the addresses of the two different objects will be different
		
		System.out.println("**********");
		System.out.println(a == d);//true
		System.out.println(a != b);//true
		
		System.out.println("**********");
		System.out.println(c > a);//true
		System.out.println(d >= 26);//false
		
		System.out.println("**********");
		System.out.println(a <= c);//true
		System.out.println(b < b);//false
		
		System.out.println("**********");
		System.out.println(status == flag);//false
		System.out.println(status == !status);//false
		
		System.out.println("**********");
		System.out.println(!status);//true
		System.out.println(status = true);//true
		
		System.out.println("**********");
		System.out.println(s1.equals(s2));//true
		System.out.println(s3.equalsIgnoreCase(s4));//true

		
		System.out.println("Main method ended!");

	}

}
