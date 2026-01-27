package com.javaintro;

public class Return {
	void method1() {
		System.out.println("Iam void");
	}
	
	int method2() {
		return 100;
	}
	

	public static void main(String[] args) {
		Return r = new Return();
		r.method1();
		System.out.println(r.method2());

	}

}
