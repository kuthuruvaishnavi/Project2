package com.javaintro;

public class Demo1
	{
	public static void main(String[] args)
		{
		System.out.println("main method started!");
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		System.out.println("main method ended!");
		}
	static
	{
		System.out.println("static block1");
	}
	static 
	{
		System.out.println("Static Block2 ");
	}
	
	{
		System.out.println("Instance block");
	}
	
		

}
