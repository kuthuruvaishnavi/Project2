package com.fundamentals;

import java.math.BigInteger;
import java.math.BigDecimal;


class Monkey{
	
}
public class TestDatatypes2 {
	
	String name = "Vaishnavi";//string literals
	String name1 = new String("Kuthuru");//Declaration	
//Instance Variable	
	Integer i1 = 100; //100 is int  (converting int to Integer) int is primitive data type and Interger is Wrapper so conversion of that is called Auto-Boxing          
	
	Character c1 = 'c';
	Short s1 = 475;
	Long l1 = 4879808980L;
	
	BigInteger b1 = new BigInteger("10000000000000000000687989997996");
	BigInteger b2 = new BigInteger("10000000000000079809080908070899");
	
	BigDecimal b3 = new BigDecimal("7.586818567268756788943213456");	
//	Dog d = new Dog();
	Monkey m;
	public static void main(String[] args) {
		System.out.println("Main method started!");
		TestDatatypes2 t2 = new TestDatatypes2();
		
		System.out.println(t2.name);
		System.out.println(t2.i1);
		System.out.println(t2.c1);
		System.out.println(t2.s1);
		System.out.println(t2.l1);
		
		System.out.println(t2.b1);
		System.out.println(t2.b2);
//		System.out.println(t2.b1+t2.b2); //The operator + is undefined for the argument type(s) java.math.BigInteger, java.math.BigInteger
		
		System.out.println("Addition:"+ t2.b1.add(t2.b2));
		System.out.println("Multiplication:"+t2.b1.multiply(t2.b2));
		System.out.println("Division:"+ t2.b2.divide(t2.b1));
		System.out.println("Subtraction:"+ t2.b2.subtract(t2.b1));
		
//		System.out.println(t2.d);
		System.out.println(t2.m);
		
		System.out.println("Main method ended");

	}

}
