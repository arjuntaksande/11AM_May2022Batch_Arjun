package pck1;

public class Day2Class2Assignment {

	/*
	 * Assignment ( 21st May 2022 )
	 * 
	 * Print the following as mentioned in sequence below, by creating only one object
	 * 
	 * 3 parameterized constructor
	 * default constructor
	 * 2 parameterized constructor
	 * 1 parameterized constructor
	 * 4 parameterized constructor
	 * */
	
	 public Day2Class2Assignment() {
		// TODO Auto-generated constructor stub	
		 this(18,17,16);
		 System.out.println("Default Constructor");
	}
	 public Day2Class2Assignment(int a) {
		// TODO Auto-generated constructor stub
		 this(13,14);
		 System.out.println("1 Parameterized Constructor");
	}
	 public Day2Class2Assignment(int a,int b) {
		// TODO Auto-generated constructor stub
		 this();
		 System.out.println("2 Parameterized Constructor");
	}
	 public Day2Class2Assignment(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		 System.out.println("3 Parameterized Constructor");
	}
	 public Day2Class2Assignment(int a,int b,int c,int d) {
		// TODO Auto-generated constructor stub
		 this(12);
		 System.out.println("4 Parameterized Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day2Class2Assignment ref = new Day2Class2Assignment(21,22,23,24); 
	}

}
