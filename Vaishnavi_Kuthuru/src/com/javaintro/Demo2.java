package com.javaintro;

public class Demo2 {
	static Demo2 dm = new Demo2();
	static int a ;
	
	static {
		System.out.println("static Started");
		System.out.println(a);
	}
	{
		System.out.println("instance");
	}

	public static void main(String[] args) 
	{
		a = 10;
		System.out.println("main method started");
		System.out.println(a);

	}


}
