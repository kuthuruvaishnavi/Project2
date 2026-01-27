package com.fundamentals;

import java.math.BigInteger;

public class TestDatatypes {
	
	//Declaration
	byte b =(byte) 257;
	short s = 32767;
	int i = -2147483647;
	int i2 = 'c';
	
	long l = 9223372036854775807L;
	
	float f1 = 10000000F;
	float f2 = 9.586879F;
	double d = 6.4765389659369836787398698;
	
	char c1 = 'A';
	char c2 = 40;
	char c3 = '\u0010';
	char c4 = 85;
	
	
	boolean boo = false;
	boolean boo1 = true;
	BigInteger a = new BigInteger("1000000000000000000000000000000000000068687");


	public static void main(String[] args) {
		System.out.println("Main method started");
		TestDatatypes t1 = new TestDatatypes();
		
		System.out.println("byte value :" + t1.b);
		System.out.println("short value :" + t1.s);
		System.out.println("int value :" + t1.i);
		System.out.println("int value :" + t1.i2);
		System.out.println("long value :" + t1.l);
		
		System.out.println("float value :" + t1.f1);
		System.out.println("float value :" + t1.f2);
		
		System.out.println("double value :" + t1.d);
		
		System.out.println("char value :" + t1.c1);
		System.out.println("char value :" + t1.c2);
		System.out.println("char value :" + t1.c3);
		System.out.println("char value :" + t1.c4);
		
		if(t1.boo){
			System.out.println("Java is Simple");
		}
		System.out.println("boolean value :" + t1.boo);
		System.out.println("boolean value :" + t1.boo1);
		
		System.out.println("BigInteger :"+ t1.a);
		
		System.out.println("Main method Ended");
		
		

	}

}
