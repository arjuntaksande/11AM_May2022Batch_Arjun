package pck2;

public class Day10DataTypeConversion {
	/*
	 * Day 10 : 19th May 2022 : Data Type Conversion
	 */
	public void ImplicitDataTypeCasting() {
		float b;
		int a=12;
		b=a; // Implicit Data type Casting
		System.out.println("Implicite Data Type Casting. ");
				System.out.println( "Value of 'a'  is : ");
				System.out.println(" "+b);
	}
	public void ExpliciteDataTypeCasting() {
		float b=12.3F;
		int a;
		a=(int)b;
		System.out.println("Explicit Data Type Casting. ");
				System.out.println( "Value of 'b' which is Float and We are type casting to integer 'a' is : ");
				System.out.println(" "+a);
	}
	public static void main(String[] args) {
		Day10DataTypeConversion obj = new Day10DataTypeConversion();
		obj.ExpliciteDataTypeCasting();
	}
}
