package pck2;

public class Day5InheritanceChildClass extends Day5InheritanceParentClass
{
	/* Day 5th: 29th May 2022  : Inheritance : Child Class Demo
	 * Below is the Example of Single Level Inheritance*/
	public void m2() {
		System.out.println("I am Child Method");
	}
	public static void main(String[] args) {
		Day5InheritanceChildClass obj = new Day5InheritanceChildClass();
		obj.m1();
		obj.m2();
		obj.deepak=122;
		System.out.println("Value of Parent Class Variable"+obj.deepak);
	}
}
