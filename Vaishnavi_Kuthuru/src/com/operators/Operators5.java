package com.operators;

//logical operators : &&,//,!
public class Operators5 {

	public static void main(String[] args) {
		System.out.println("Main method started!");
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("******Logical and (&&) :");
		System.out.println(true && true);//true
		System.out.println(true && false);//false
		System.out.println(false && true);//false
		System.out.println(false && false);//false
		
		
		System.out.println(a < b && b < c && 4 < 10);//true
		System.out.println(a > b && b > c);//false
		
		System.out.println("********Logical or (||) :");
		System.out.println(true || true);//true
		System.out.println(true || false);//true
		System.out.println(false || true);//true
		System.out.println(false || false);//false
		
		System.out.println(a < b || b < c || 4 < 10);//true
		System.out.println(a > b || b > c);//false
		
		System.out.println("*******Logical not ( ! ) :"  );
		System.out.println(!true);//false
		System.out.println(!false);//true
		System.out.println(!(a < b || b < c || 4 < 10));//false
		System.out.println(!(a > b || b > c));//true

	}

}
