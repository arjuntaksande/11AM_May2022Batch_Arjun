package pck2;

public class Day6Assignment2Parent {
	/* Day 6 : 4th June 2022 : SUPER Keyword method example. This is Parent Class
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
			//this.m1(57,75,85);
			System.out.println("parent default method");
		}
		public void m1(int a) {
			//this.m1();
			System.out.println("parent 1 parameterized method");
		}
		public void m1(int a,int b) {
			//this.m1(23);
			System.out.println("parent 2 parameterized method");
		}
		public void m1(int a,int b,int c) {
			System.out.println("parent 3 parameterized method");
		}
}
