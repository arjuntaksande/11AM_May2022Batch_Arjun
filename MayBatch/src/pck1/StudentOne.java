package pck1;

public class StudentOne {
//Assignment 14th May 2022
	int rollno;
	int age;
	
	public void display1() {
		System.out.println("I am insde Display1 method");
	}
	public void display2() {
		System.out.println("I am insde Display2 method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentOne ObjStudenOne = new StudentOne();
		ObjStudenOne.rollno = 26;
		System.out.println("StudentOne Roll No is "+ObjStudenOne.rollno);
		ObjStudenOne.age = 12;
		System.out.println("StudentOne Age is "+ObjStudenOne.age);
		ObjStudenOne.display1();
		ObjStudenOne.display2();
	}

}
