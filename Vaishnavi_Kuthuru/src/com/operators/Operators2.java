package com.operators;

//Assignment Operators : += , -=, %=, /=
public class Operators2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		
		int a = 10;
		int result = 0;
		
		result = result + a;
		System.out.println(result); //o/p: 10
		
		result += a;
		System.out.println(result);//20
		
        //result = result + 5.5; //double cannot convert to int(Type mismatch error)
		result = (int) (result + 5.5);// 25
		System.out.println(result);
		// the one in the up and the one in the down works same,but it varies with the previous result
		result += 5.5;//Narrowing type casting (15 += 5.5 =>20)
		System.out.println(result);//30
		
		result =(int) (result - 4.5);		
		System.out.println(result);//25
		// the one in the up and the one in the down works same,but it varies with the previous result
		result -= 4.5;		
		System.out.println(result);//20
		
		result = (int) (result * 6.6);
		System.out.println(result);//132
		// the one in the up and the one in the down works same,but it varies with the previous result 
		result *= 6.6;
		System.out.println(result);//871
		
		result = result % 4;
		System.out.println(result);//3
		// the one in the up and the one in the down works same,but it varies with the previous result 
		result %= 5;
		System.out.println(result);//3
		
		result = result % 5; // if the first number is smaller to the second it will return the first number itself(4%5 = 4)
		System.out.println(result);//3
		// the one in the up and the one in the down works same,but it varies with the previous result 
		result %= 5;
		System.out.println(result);//3
	}

}
