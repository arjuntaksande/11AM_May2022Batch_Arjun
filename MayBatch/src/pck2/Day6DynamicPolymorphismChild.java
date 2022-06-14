package pck2;

public class Day6DynamicPolymorphismChild extends Day6DynamicPolymorphismParent
{
	//Day 6- 4th June 2022
	// Dynamic Polymorphism or Run Time Polymorphism or method Overridding
	public void arithmetic(int a, int b) {
		int c;
		c = a+b;
		System.out.println("Result is : "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day6DynamicPolymorphismChild obj = new Day6DynamicPolymorphismChild();
		obj.arithmetic(12,2);
	}

}
