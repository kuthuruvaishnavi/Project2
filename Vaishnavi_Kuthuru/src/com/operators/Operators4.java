package com.operators;

public class Operators4 {

	public static void main(String[] args) {
		System.out.println("Main method Started!");
		
		int a = 5;
		int b = 6;
		
		// - , +
		System.out.println(-a);//-5
		System.out.println(+b);//6
		System.out.println("*********");
		System.out.println(a++);//5
		System.out.println(++a);//7
		System.out.println(a--);//7
		System.out.println(--a);//5
		System.out.println("*********");
		System.out.println(b++);//6
		System.out.println(++b);//8
		System.out.println(b--);//8
		System.out.println(--b);//6
		
		System.out.println("a : " +  a);
		System.out.println("b : " +  b);
	}

}
