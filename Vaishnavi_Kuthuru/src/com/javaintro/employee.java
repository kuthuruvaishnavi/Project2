package com.javaintro;

public class employee {
	
	int eid;
	String ename;

	public static void main(String[] args) {
		System.out.println("main method started");
		
		employee e1 = new employee();
		System.out.println(e1);
		e1.eid = 12;
		e1.ename = "Vaishu";
		System.out.println(e1.eid);
		System.out.println(e1.ename);
		
		e1 = null;
		System.out.println(e1);
		
		employee e2 = new employee();
		System.out.println(e2);
		
		System.out.println("main method ended");
		

	}

}
