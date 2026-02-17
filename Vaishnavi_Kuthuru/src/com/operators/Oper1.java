package com.operators;

public class Oper1 {
	
	int a = 10;
	int b = 23;

	public static void main(String[] args) {
		
		Oper1 o1 = new Oper1();
		o1.show();
	}
	void show(){
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);		
	}

}
