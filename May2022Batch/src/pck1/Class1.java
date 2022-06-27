package pck1;

public class Class1 {
// Day2 15th May 2022
	public int add(int a, int b) {
		int c = a+b;
		System.out.println("Sum Result is : "+c);
		return c;
	}
	public int sub(int x, int y) {
		int z = x-y;
		System.out.println("Substraction Result is : "+z);
		return z;
	}
	public void multi(int e, int f) {
		
		int g = e*f;
		System.out.println("Multiplication Result is : "+g);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 Obj = new Class1();
		int sum = Obj.add(10 ,2);
		int sub = Obj.sub(10, 2);
		Obj.multi(sum, sub);
	}

}
