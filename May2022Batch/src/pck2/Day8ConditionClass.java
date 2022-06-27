package pck2;

import java.util.Scanner;

public class Day8ConditionClass {

	/*
	 * Day 8 : 12th June 2022 : Demo for 
	 * if condition,
	 * if else condition;
	 */
	public void mymethod() {
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter value of a :");
		int a=s.nextInt();
		System.out.println("Value of a is : "+a);
		if (a%2==0) {
			System.out.println("Even Number "+a);
		}
		else {
			System.out.println("Odd number "+a);
		}
	}
	/* Below Method for 
	 * if
	 * else if
	 * else if
	 * else 
	 * LADDER
	 */
	public void mymarkgrades() {
		Scanner s1= new Scanner(System.in);
		System.out.print("Please enter marks of Student :");
		int marks=s1.nextInt();
		if ((marks>=0)&&(marks<35)) {
			System.out.println("Fail ");
		}
		else if ((marks>=35)&&(marks<60)) {
			System.out.println("Pass ");
		}
		else if ((marks>=60)&&(marks<80)) {
			System.out.println("First Division ");
		}
		else if ((marks>=80)&&(marks<100)) {
			System.out.println("Merite ");
		}
		else {
			System.out.println("Please enter Correct Marks");
		}
	}
	/*
	 * Below Method for nested if else
	 */
	public void mynestedifelse() {
		Scanner s2= new Scanner(System.in);
		System.out.print("Please enter a number :");
		int number=s2.nextInt();
		if(number>0) {
			System.out.println("Number is greater than zero");
			if(number%2==0) {
				System.out.println("Even number "+number);
			}
			else {
				System.out.println("Odd number "+number);
			}
		}else {
			System.out.println("Please enter +ve number");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day8ConditionClass ob = new Day8ConditionClass();
		ob.mymethod(); // if Condition
		ob.mymarkgrades(); // if else if else if ( ladder )
		ob.mynestedifelse();  // nested if else
	}

}
