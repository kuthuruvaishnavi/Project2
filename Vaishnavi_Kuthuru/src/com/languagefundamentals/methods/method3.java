package com.languagefundamentals.methods;

import java.util.Scanner;

// no return + with argument
public class method3 {

    static int a, b = 10;

    void addition(int a, int b) {
        long c = a + b;
        System.out.println("Addition: " + c);
    }

    void subtraction(long a, long b) {
        double c = a - b;
        System.out.println("Subtraction: " + c);
    }

    void multiplication(float a, double b) {
        double c = a * b;
        System.out.println("Multiplication: " + c);
    }

    void division(double a, double b) {
        double c = a / b;
        System.out.println("Division: " + c);
    }

    void modulus(int a, double b) {
        double c = a % b;
        System.out.println("Modulus: " + c);
    }

    public static void main(String[] args) {

        System.out.println("Main method started!");

        // create object
        method3 m1 = new method3();

        // Scanner object
        Scanner s = new Scanner(System.in);

        System.out.println("Enter i value:");
        int i = s.nextInt();

        System.out.println("Enter j value:");
        int j = s.nextInt();

        // method calls
        m1.addition(i, j);            // int → long (implicit)
        m1.subtraction(i, j);        
        m1.multiplication(i, j);     
        m1.division(i, j);
        m1.modulus(i, j);

        System.out.println("a :" + a); // default value = 0
        System.out.println("b :" + b); // value = 10

        System.out.println("Main method ended!");
        s.close();


    }
    

}

