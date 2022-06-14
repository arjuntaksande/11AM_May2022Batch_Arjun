package pck2;

public class Day5DebugClassEg {
/* * Day 5th 29th May 2022 &  
 * * Debugging example  
 * * Break Point */
	int deepak; // global variable
	public void m1() {
		System.out.println("First Method");
		System.out.println("First Method second line");
	}
	public void m2() {
		System.out.println("Second Method");
		System.out.println("Second Method second line");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method First Line");
		Day5DebugClassEg obj = new Day5DebugClassEg();
		System.out.println("Main Method Second Line");
		obj.m1();
		System.out.println("Main Method Third line");
		System.out.println("Main Method fourth line");
		obj.m2();
	}

}
