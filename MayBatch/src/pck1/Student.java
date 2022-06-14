package pck1;

public class Student {
//class day 1 14th may 2022
	int a;
	public void deepak () {
		System.out.println("Welcome All of You");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Student obj1 = new Student();
			obj1.deepak();
			System.out.println("Value of Variable: "+obj1.a);
			obj1.a=123;
			System.out.println("Value of Variable: "+obj1.a);
			obj1.a=456;
			System.out.println("Value of Variable: "+obj1.a);
	}

}
