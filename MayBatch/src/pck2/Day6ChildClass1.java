package pck2;

public class Day6ChildClass1 extends Day6ParentClass
{
	/*
	 * Day 6th : 4th June 2022
	 * Child Class : Multi level Inheritance, demo with Constructors
	 */

	public Day6ChildClass1(int a, int b) {
		// TODO Auto-generated constructor stub
		super(11,22);
		System.out.println("Child Two Parameterized Constructors");
	}
	public Day6ChildClass1(int a) {
		// TODO Auto-generated constructor stub
		System.out.println("Child One Parameterized Constructors");
	}
	public Day6ChildClass1() {
		// TODO Auto-generated constructor stub
		System.out.println("Child Default Constructors");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day6ChildClass1 obj = new Day6ChildClass1(12,12);
		
	}

}
