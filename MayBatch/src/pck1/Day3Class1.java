package pck1;

public class Day3Class1 {
// Day  3 Class  21st may 2022
	/*Constructor Concept
	 * 1. constructor is like method
	 * 2. constructor name and class name are same
	 * 3. No return type
	 * 4. no need to call constructor it will call itself as we create the object
	 * 
	 * */ 
	
	public Day3Class1() {
		// TODO Auto-generated constructor stub
		System.out.println("Default Constructor");
	}
	public Day3Class1(int a) {
		// TODO Auto-generated constructor stub
		// using This keyword
		this(12,22); // this is will Two Parameterized Constructor
		System.out.println("One Parameterized Constructor");
	}
	public Day3Class1(int a, int b) {
		// TODO Auto-generated constructor stub
		System.out.println("Two Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Day3Class1 ref = new Day3Class1(); // Default Constructor [ Control will goto Default Constructor ]
			Day3Class1 ref1 = new Day3Class1(233); // One Parameterized Constructor  [ Control will goto One Parameterized Constructor ]
			//Day3Class1 ref2 = new Day3Class1(23, 44); // Two Parameterized Constructor [ Control will goto Two Parameterized Constructor ]
	}

}
