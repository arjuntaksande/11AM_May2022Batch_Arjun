package pck2;

public class Day6Assignment2Child extends Day6Assignment2Parent
{
	/* Day 6 : 4th June 2022 : SUPER Keyword method example, This is Child Class
	 *  Assignment ( Output should be in below sequence) ( using this and super keyword.)
	 *	parent 3 parameterized method
	 *	parent default method
	 *	parent 1 parameterized method
	 *	parent 2 parameterized method
	 *	child 2 parameterized method
	 *	child default method
	 *	child 1 parameterized method
	 *	child 3 parameterized method
	 */
	public void m1() {
		this.m1(32, 36);
		System.out.println("child default method");
	}
	public void m1(int a) {
		this.m1();
		System.out.println("child 1 parameterized method");
	}
	public void m1(int a,int b) {
		super.m1(54, 59);
		System.out.println("child 2 parameterized method");
	}
	public void m1(int a,int b,int c) {
		this.m1(23);
		System.out.println("child 3 parameterized method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day6Assignment2Child Obj = new Day6Assignment2Child();
		Obj.m1(5, 3, 8);
	}

}
