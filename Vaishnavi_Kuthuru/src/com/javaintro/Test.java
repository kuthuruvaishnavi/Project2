package com.javaintro;

class Student {
	Student friend;
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize called");

	}
}

public class Test {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

//		s1.friend = s2;
//      s2.friend = s1;

		s1 = null;
		s2 = null;

	}

}
