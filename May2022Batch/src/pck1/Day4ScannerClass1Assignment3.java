package pck1;

import java.util.Scanner;

public class Day4ScannerClass1Assignment3 {

	/*
	 * Day4- 28th May 2022
	 * Assignment 3 : (((((x1*x2)-x3)*x4)+x5)/x6)
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day4ScannerClass1Assignment2 obj1 = new Day4ScannerClass1Assignment2(); // I have user has a relationship in this assignment3
				
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
		
		int result = obj1.multi(x1, x2);
		result = obj1.sub(result, x3);
		result = obj1.multi(result, x4);
		result = obj1.add(result, x5);
		result = obj1.div(result, x6);
		System.out.println("The Total for (((((x1*x2)-x3)*x4)+x5)/x6) is : "+result);
		
	}

}
