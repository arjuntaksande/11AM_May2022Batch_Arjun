package pck1;

public class Class3 {
	/* Assignment 2 for 
	((((10-2)+2)-2)*2)/2)
		*/
	
	public int sum(int a, int b) {
		int c = a+b;
		System.out.println("Sum Result is : "+c);
		return c;
	}
	public int sub(int x, int y) {
		int z = x-y;
		System.out.println("Substraction Result is : "+z);
		return z;
	}
	public int multi(int e, int f) {
		
		int g = e*f;
		System.out.println("Multiplication Result is : "+g);
		return g;
	}
	public void div(int x1, int x2) {
		
		int x3 = x1/x2;
		System.out.println("Division Result is : "+x3);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class3 Obj = new Class3();
		int subresult = Obj.sum(10 ,2);
		int sumresult1 = Obj.sum(subresult, 2);
		int sumresult = Obj.sub(sumresult1, 2);
		int multiresult = Obj.multi(sumresult,2);
		Obj.div(multiresult, 2);
	}

}
