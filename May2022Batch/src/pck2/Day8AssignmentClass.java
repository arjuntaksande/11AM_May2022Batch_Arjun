package pck2;

import java.util.Scanner;

public class Day8AssignmentClass {
/*
 * Day 8 : 12 June 2022
 * Assignment 1 : Swapping of two number without using third variable.
 * Assignment 2 : A number is Prime or not : a number that will be divisible by itself or 1.
 * Assignment 3 : A number is palindrome or not---121--- reverse of the number is the same number itself.
 * Assignment 4 : A number is Armstrong or not ----153----1+125+27.
 * Assignment 5 : Table print ( you can print any table ).
 * Assignment 6 : Factorial of a number.
 * Assignment 7 : Fibonacci series up to 12-
 * 					0 1 1 2 3 5 8 13 21 34 55 89 
 */
	public void swapping() {
		// Assignment 1 : Swapping of two number without using third variable.
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter value of first number :");
		int n1=s.nextInt();
		System.out.println("---------------------------------------");
		System.out.print("Please enter value of second number :");
		int n2=s.nextInt();
		System.out.println("---------------------------------------");
		System.out.println("First number is "+n1);
		System.out.println("---------------------------------------");
		System.out.println("Second number is "+n2);
		System.out.println("---------------------------------------");
		
		n1 = n1+n2;
		n2 = n1-n2;
		n1 = n1-n2;
		System.out.println("------------------Swapping of number Output is ---------------------");
		System.out.println("Now the First number is "+n1);
		System.out.println("---------------------------------------");
		System.out.println("Now the Second number is "+n2);
		System.out.println("---------------------------------------");
	}
	public void primenumber() {
		// Assignment 2 : A number is Prime or not: a number that will be divisible by itself or 1.
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number to find out if it is a PRIME number ? :");
		int number=s.nextInt();
		System.out.println("Enterred Number is >>>>>>>"+number );
		int half = number/2;
		int temp=0;
		for ( int i=2;i<=half;i=i+1) {
			if(number%i==0) {
				System.out.println("The Number "+number+" is not Prime Number");
				temp=1;
				break;
			}}
			if(temp==0) {
				System.out.println("The Number "+number+" is Prime Number");
			}
		
		System.out.println("--------------------");
	}// Done Program
	public void armstrongnumber() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number to check if it is a Armstrong number or not:");
		int number=s.nextInt();
		System.out.println("Enterred Number is >>>>>>>"+number );
		int oldnumber=number;
		int sum=0;
		while(number>0) {
			int r=number%10;
			sum=sum+r*r*r;
			number=number/10;
		}
		if(oldnumber==sum) {
			System.out.println("The entered number "+oldnumber+" is a Armstrong number");
		}else System.out.println("The entered number "+oldnumber+" is not Armstrong number");
		System.out.println("--------------------");
	}
	public void palindrome() {
		//Assignment 3 : A number is palindrome or not---121--- reverse of the number is the same number itself.
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to know if it is a Palindrome or not :");
		int number=s.nextInt();
		System.out.println("Enterred Number is >>>>>>>"+number );
		int sum =0; 
		int oldnumber=number;
		while(number>0) {
		int r=number%10;
		sum =sum*10+r;
		number=number/10;
		}
		if(oldnumber==sum) {
			System.out.println("The number"+oldnumber+"is Palindrome");
		}else System.out.println("The number"+oldnumber+"is not Palindrome");
		
		System.out.println("--------------------");
	}
	public void table () {
		// Assignment 5 : Table print ( you can print any table ).
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter number to print the table of that number :");
		int num=s.nextInt();
		System.out.println("Enterred Number is >>>>>>>"+num );
		for(int i=1;i<=10;i=i+1) {
			System.out.println("The Table for the "+num+" * "+i+" = "+num*i);
			System.out.println("--------------------");
		}
	}
	public void fibonocci() {
	//	Assignment 7 : Fibonacci series up to 12-
		int a=0;
		int b=1;int sum;
		System.out.println("Value of 'a' is : "+a);
		System.out.println("Value of 'b' is : "+b);
		for(int i=1;i<=10;i=i+1) {
			sum = a+b;
			System.out.println(" Value of Sum is :"+sum);
			a=b;
			b=sum;
		}
		System.out.println("--------------------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day8AssignmentClass obj = new Day8AssignmentClass();
		obj.swapping(); // Assignment Swapping of 2 numbers using 3rd variable
		obj.primenumber();
		obj.palindrome();
		obj.armstrongnumber();
		obj.table();
		obj.fibonocci();
	}

}
