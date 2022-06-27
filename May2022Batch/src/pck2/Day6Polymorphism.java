package pck2;

public class Day6Polymorphism {
	//Day 6- 4th June 2022
	// Static Polymorphism or Compile Time Polymorphism or method Overloading
	public void sum(int a, int b) {
		int c;
		c = a+b;
		System.out.println("Result is : "+c);
	}
	public void sum(int a, int b,int c) {
		int x;
		x = a+b+c;
		System.out.println("Result is : "+x);
	}

	public static void main(String[] args) {
		Day6Polymorphism obj = new Day6Polymorphism();
		obj.sum(23,12);
		obj.sum(2,4,1);
	}
}
