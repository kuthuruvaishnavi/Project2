package com.javaintro;

public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		method1();
	}
	
		
	static void method1() {
		System.out.println("method1 called");
		Demo3 d3 = new Demo3();
		d3.method2();
	}
	void method2() {
		System.out.println("method2 called");
		method4();
	}
	static void method3() {
		System.out.println("method3 called");
	}
	void method4() {
		System.out.println("method4 called");
		method3();
	}

}
