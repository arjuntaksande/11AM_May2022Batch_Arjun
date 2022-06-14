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
	public void arithmetic(double d, double e) {
		double c;
		c = d+e;
		System.out.println("Result is : "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day6DynamicPolymorphismChild obj = new Day6DynamicPolymorphismChild();
		obj.arithmetic(12,2);
		obj.arithmetic(10.5, 20.5);
		System.out.println("To Check Changes done in local");
	}

}
