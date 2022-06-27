package pck2;

public class Day6AssignmentChild extends Day6AssignmentParent
{
	/*
	 * Day 6th : 4th June 2022 : This is Child Class
	 * Assignment: Output should be in below sequence (using this and super keyword)
	 * 
	 * parent 3 parameterized constructor
	 * parent default constructor
	 * parent 1 parameterized constructor
	 * parent 2 parameterized constructor
	 * child default constructor
	 * child 3 parameterized constructor
	 * child 2 parameterized constructor
	 * child 1 parameterized constructor
	 */
	public Day6AssignmentChild(int a,int b,int c) {
		// TODO Auto-generated constructor stub	
		this();
		System.out.println("child 3 parameterized constructor");
	}
	public Day6AssignmentChild(int a,int b) {
		// TODO Auto-generated constructor stub
		this(11,10,9);
		System.out.println("child 2 parameterized constructor");
	}
	public Day6AssignmentChild(int a) {
		// TODO Auto-generated constructor stub
		this(2,3);
		System.out.println("child 1 parameterized constructor");
	}
	public Day6AssignmentChild() {
		// TODO Auto-generated constructor stub
		super(111,222);
		System.out.println("child default constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day6AssignmentChild constructorObj = new Day6AssignmentChild(14);
	}
}
