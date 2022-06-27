package pck2;

public class Day8LoopClass {
 /*
  * Day 8 : 12th June 2022
  * Demo for 'For Loop'
  */
	public void myforloopmethod() {
		for (int i=0;i<=10; i++) {
			System.out.println("Value of i :"+i);
		}
	}
	public void mywhileloopmethod() {
		int a=0;
		while(a<5) {
			System.out.println("Value of a is :"+a);
			a=a+1;
		}
	}
	public void mydowhileloopmethod() {
		int a=0;
		do {
			System.out.println("Value of a is :"+a);
			a=a+1;
		}while(a<10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day8LoopClass obj = new Day8LoopClass();
		obj.myforloopmethod(); // for loop call
		obj.mywhileloopmethod(); // while loop call
		obj.mydowhileloopmethod(); // do while loop call
	}

}
