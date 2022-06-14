package pck2;

public class Day6AssignmentParent {
	/*
	 * Day 6th : 4th June 2022 : This PARENT class
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
	public Day6AssignmentParent(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		System.out.println("parent 3 parameterized constructor");
	}
	public Day6AssignmentParent(int a,int b) {
		// TODO Auto-generated constructor stub
		this(4);
		System.out.println("parent 2 parameterized constructor");
	}
	public Day6AssignmentParent(int a) {
		// TODO Auto-generated constructor stub
		this();
		System.out.println("parent 1 parameterized constructor");
	}
	public Day6AssignmentParent() {
		// TODO Auto-generated constructor stub
		this(43,23,54);
		System.out.println("parent default constructor");
	}

}
