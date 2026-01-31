package com.languagefundamentals.methods;

import java.util.Scanner;


public class BranchProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your branch:");
		String branch = sc.nextLine();
		
		BranchProgram b = new BranchProgram();
		b.getBranch(branch);
	}
	void getBranch(String branch) {
		System.out.println("My Branch is " + branch);
	}

}
