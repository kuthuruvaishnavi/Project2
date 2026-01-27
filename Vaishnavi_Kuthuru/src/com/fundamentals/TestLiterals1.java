package com.fundamentals;

public class TestLiterals1 { //Class Level  
	
	

	public static void main(String[] args) { //Method Level
		TestLiterals1 t1 = new TestLiterals1();
		System.out.println(t1);
//		int a = 0x27716f4;
//		System.out.println(a);
		System.out.println(t1.hashCode());
		
		
		//Local
		//literals:
		//integral literal:These are of 4 types
		//Decimal literals :from 0 to 9
		int a1 = 10;
		int a2 = 123;
		int a3 = 456;
		int a4 = 789;
		System.out.println("");
		System.out.println("****Decimal Literals*****");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		
		//Octal Literal:Starts with number '0'
		int a5 = 012345;
		int a6 = 0456;
		int a7 = 0567;
		int a8 = 0675;
		System.out.println("****Octal Literals*****");
		System.out.println(a5);
		System.out.println(a6);
		System.out.println(a7);
		System.out.println(a8);
		
		//Hexa Decimal Literal:Starts with 0x or 0X
		int a9 = 0X123;
		int a10 = 0X456;
		int a11 = 0x789;
		int a12 = 0xeee;
		int a13 = 0Xebc;
		int a14 = 0XDAD;
		int a15 = 0X123a;
		int a16 = 0XaB;
		System.out.println("****Hexadecimal*****");
		System.out.println(a9);
		System.out.println(a10);
		System.out.println(a11);
		System.out.println(a12);
		System.out.println(a13);
		System.out.println(a14);
		System.out.println(a15);
		System.out.println(a16);
		
		//Binary Literals : Starts with 0b or 0B
		int a17 = 0b0101;
		int a18 = 0b1010;
		System.out.println("****Binary literals*****");
		System.out.println(a17);
		System.out.println(a18);
		
		
	}

}
