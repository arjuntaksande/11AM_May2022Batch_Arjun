package pck1;

public class Day4Class1 {
/*
 * Day 4 - 28th May 2022
 */
	int deepak ; // global variable
	public void m1() {

		System.out.println("I am First Method m1 ");
		this.m2(); // it will call second method
		this.m2();
	}
	public void m2() {
		System.out.println("I am Second Method m2");
	}
	public void m3() {
		int deepak =12;
		deepak=deepak+1;
		int arju = 10; // local variable 
		System.out.println(" Value of Local Varial Deepak is : "+deepak);
		System.out.println(" Value of local variable arju is : "+arju);
	}
	public void m4(int deep)   // deep is local variable
	{
		deepak=deep;
		System.out.println(" Value of Deepak is : "+deepak);
	}
	public void m5(int deepak)   // When local Variable and global Variable names are same
		{
		this.deepak=deepak;
		System.out.println(" Value of Deepak is : "+deepak);
	}
	public static void main(String[] args) {
		
		Day4Class1 ref = new Day4Class1();
		ref.m1();
		ref.m2();
		ref.m3();

		System.out.println(ref.deepak);
		ref.m4(1222);
		ref.m5(2609); // When local Variable and global Variable names are same
	}
}
