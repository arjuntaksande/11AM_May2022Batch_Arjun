package pck1;

public class Day4Class1Assignment {
/* Day 4 28th May 2022
 * Assignment on Method Calling 
 * using 
 * 'this' keyword.
 * 
 *    3 parameterized method
 *    default method
 *    1 parameterized method
 *    2 parameterized method
 *    4 parameterized method
 */
	public void m1() {
		System.out.println("Default Method m1");
		this.m1(26);
	}
	public void m1(int a) {
		System.out.println("1 Parameterized Method m1");
		this.m1(12,15);
	}
	public void m1(int a, int b) {
		System.out.println("2 Parameterized Method m1");
		this.m1(20,22,24,26);
	}
	public void m1(int a, int b,int c) {
		System.out.println("3 Parameterized Method m1");
		this.m1();
	}
	public void m1(int a, int b,int c,int d) {
		System.out.println("3 Parameterized Method m1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		// Create Object for the class
		Day4Class1Assignment ref = new Day4Class1Assignment();
		ref.m1(10,9,8);
	}

}
