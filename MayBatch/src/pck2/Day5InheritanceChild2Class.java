package pck2;

public class Day5InheritanceChild2Class extends Day5InheritanceParentClass
{
	/* Day 5th: 29th May 2022  : Inheritance : Child Class Demo
	 * Below is the Example of Hierarchical Inheritance*/
	public void child2m3() {
		System.out.println("I am Child2 Method M3");
	}
	public static void main(String[] args) {
		Day5InheritanceChild2Class obj = new Day5InheritanceChild2Class();
		obj.m1();
		obj.deepak=124;
		System.out.println("Variable from Parent Class :"+obj.deepak);
		obj.child2m3();
	}
	
}
