package com.fundamentals;

public class TestVariables1 {

	// Instance variables + primitive
	int id;
	String name;

	// static variables
	static int orgId = 76;
	static String orgName = "sreeja";

	public static void main(String[] args) {
		System.out.println("main method started");

		TestVariables1 t1 = new TestVariables1();
		t1.id = 18;
		t1.name = "Kohli";

		// local variables
		final int i = 10;
		String n = "vaishu";
		

		var id = 45;
		var name = "Rohith Sharma";
		
		int orgId = 666;
		String orgName = "Vss";
		

		// Accessing the instance data by using object reference variables
		System.out.println(t1.id);
		System.out.println(t1.name);

		// Accessing the static data directly or we can also access by using class name
		System.out.println(orgId);
		System.out.println(orgName);

		// We can access buy using class name
		System.out.println(TestVariables1.orgId);
		System.out.println(TestVariables1.orgName);

		// we can also access by using object reference variable
		// gives warning not error that static variables can be accessed using static
		// method
		// only (means using class name) not using reference id
		System.out.println(TestVariables1.orgId);
		System.out.println(TestVariables1.orgName);

		// Accessing the local variables
		System.out.println(i);
		System.out.println(n);

		// Accessing
		System.out.println(id);
		System.out.println(name);

	}

}
