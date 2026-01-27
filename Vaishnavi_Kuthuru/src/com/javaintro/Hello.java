package com.javaintro;

public class Hello {
	
	static void hello() {
		System.out.println("Hello Guys,Good morning!");
	}

	public static void main(String[] args) {
		System.out.println("Main method started!");
		Hello h = new Hello();
		
		hello();// static methods can be called in static area
		h.welcome();//we can't directly call instance methods in static area
		// to call instance method in static area we must create an object and can call in atatic area
		System.out.println("Main method ended!");
		System.out.println(Thread.currentThread().getName());
	}
	void welcome() {
		System.out.println("welcome to java world!");
	}

}
