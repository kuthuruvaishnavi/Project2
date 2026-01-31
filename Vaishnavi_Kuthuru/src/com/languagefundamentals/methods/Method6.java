package com.languagefundamentals.methods;

import java.util.Scanner;

//with return type + no Argument

public class Method6 {

	static Scanner sc = new Scanner(System.in);

	void main(String[] args) {
		System.out.println("Main method Started!");
		double Sal = getEmployeeSalary();
		double bon = getEmployeeBonus();
		
		System.out.println("Total Salary :" +(Sal + bon));;

	}

	double getEmployeeSalary() {
		System.out.println("Enter Salary:");
		double salary = sc.nextDouble();
		return salary;
	}

	double getEmployeeBonus() {
		System.out.println("Enter Bonus:");
		double bonus = sc.nextDouble();
		return bonus;

	}

}
