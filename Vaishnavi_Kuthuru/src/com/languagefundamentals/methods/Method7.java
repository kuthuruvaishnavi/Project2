package com.languagefundamentals.methods;

//With return type + with Argument
import java.util.Scanner;
//Area of Circle,Triangle,Square and Rectangle

public class Method7 {

	void main(String[] args) {
		System.out.println("Main method started");
		Scanner sc = new Scanner(System.in);
		
		//Area of circle
		System.out.println("Enter Radius :");
		double radius = sc.nextDouble();
		System.out.println("Area of Circle: " + getCircle(radius));
		
		//Area of Triangle
		System.out.println("Enter base value:");
		double base = sc.nextDouble();
		System.out.println("Enter height value:");
		double height = sc.nextDouble();
		System.out.println("Area of Triangle is" + getTriangle(base , height));
		
		//Area of Square
		System.out.println("Enter the Side:");
		double side = sc.nextDouble();
		System.out.println("Area of square " + getSquare(side));
		
		//Area of Rectangle
		System.out.println("Enter the length:");
		double length = sc.nextDouble();
		System.out.println("Enter the breadth");
		double breadth = sc.nextDouble();
		System.out.println("Area of Rectangle " + getRectangle(length , breadth));
		
		sc.close();
	}
	
	double getCircle(double r) {
		double Cir = Math.PI* r * r;
		return Cir;
	}
	
	double getTriangle(double b, double h) {
		double Tri = 0.5 * b * h;
		return Tri;
	}
	
	double getSquare(double s) {
		double Squ = s * s;
		return Squ;
	}
	
	double getRectangle(double l, double b) {
		double Rec = l * b ;
		return Rec;
	}
	

}
