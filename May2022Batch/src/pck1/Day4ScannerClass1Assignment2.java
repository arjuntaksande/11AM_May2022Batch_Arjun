package pck1;

import java.util.Scanner;

public class Day4ScannerClass1Assignment2 {
	/*
	 * Day 4 - 28th May2022
	 * Assignment 2 : (((((x1+x2)-x3)+x4)*x5)/x6)
	 * Using Scanner Class
	 */
	
	public int add(int a1, int a2) {
		int summation=a1+a2;
		System.out.println("The Result of addition is : "+summation);
		return summation;
	}
	public int sub(int a1, int a2) {
		int substraction=a1-a2;
		System.out.println("The Result of substration is : "+substraction);
		return substraction;
	}
	public int multi(int a1, int a2) {
		int multiply =a1*a2;
		System.out.println("The Result of multiplication is : "+multiply);
		return multiply;
	}
	public int div(int a1, int a2) {
		int division=a1/a2;
		System.out.println("The Result of division is : "+division);
		return division;
	}
	public static void main(String[] args) {
		 
		System.out.print("Please enter value of 'x1' : ");
		Scanner obj = new Scanner(System.in);
		int x1 = obj.nextInt(); 
		
		System.out.print("Please enter value of 'x2' : ");
		int x2 = obj.nextInt();
		
		System.out.print("Please enter value of 'x3' : ");
		int x3 = obj.nextInt();
		
		System.out.print("Please enter value of 'x4' : ");
		int x4 = obj.nextInt();

		System.out.print("Please enter value of 'x5' : ");
		int x5 = obj.nextInt();

		System.out.print("Please enter value of 'x6' : ");
		int x6 = obj.nextInt();
		
		// Assignment 2 : ((((( x1+x2)-x3)+x4)*x5)/x6)
		Day4ScannerClass1Assignment2 obj1 = new Day4ScannerClass1Assignment2();
		int total = obj1.add(x1, x2);
		
		total = obj1.sub(total, x3);
		
		total = obj1.add(total, x4);
		
		total = obj1.multi(total, x5);
		
		total = obj1.div(total, x6);
		
		System.out.println("The Total for ((((( x1+x2)-x3)+x4)*x5)/x6) is : "+total);
	}
	
}
