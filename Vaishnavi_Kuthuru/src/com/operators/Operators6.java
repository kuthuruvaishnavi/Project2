package com.operators;

//Bitwise operators:
public class Operators6 {

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		System.out.println("******Bitwise and (&) :");
		System.out.println(true & true);//true
		System.out.println(true & false);//false
		System.out.println(false & true);//false
		System.out.println(false & false);//false
	
		System.out.println(45 & 34);
		System.out.println(34 & 23);
		System.out.println(11 & 23);
		System.out.println(23 & 78);
	
		
		System.out.println("********Bitwise or (|) :");
		System.out.println(true | true);//true
		System.out.println(true | false);//true
		System.out.println(false | true);//true
		System.out.println(false | false);//false
		
		System.out.println(45 | 34);
		System.out.println(34 | 23);
		System.out.println(11 | 23);
		System.out.println(23 | 78);
		
		System.out.println("********Bitwise xor (^) :");
		System.out.println(true ^ true);//false
		System.out.println(true ^false);//true
		System.out.println(false ^ true);//true
		System.out.println(false ^ false);//false
		
		System.out.println(45 ^ 34);
		System.out.println(34 ^ 23);
		System.out.println(11 ^ 23);
		System.out.println(23 ^ 78);
		
		System.out.println(~6);// ~6 = -(n+1) = -7
	}

}
