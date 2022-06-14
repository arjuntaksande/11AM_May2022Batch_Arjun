package pck2;

public class Day5ChildsChildClass extends Day5InheritanceChildClass
{
	/* Day 5th: 29th May 2022  : Inheritance : Child Class Demo
	 * Below is the Example of multi-level Inheritance*/
	public void m3() {
		System.out.println("I am Childs Child Class Method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day5ChildsChildClass obj = new Day5ChildsChildClass();
		obj.m1(); // Calling Method of Grandfather Class
		obj.m2(); // Calling Method of Parent Class
		obj.deepak=123;
		System.out.println("Value of variable from Parent Class is = "+obj.deepak);
		obj.m3(); // Calling Method of Same Class
	}

}
