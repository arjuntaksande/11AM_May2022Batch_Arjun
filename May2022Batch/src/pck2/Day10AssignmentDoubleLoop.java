package pck2;

public class Day10AssignmentDoubleLoop {

	public void printRightAngleTriangle() {
		/*    Print with '*' A Right Angle Triangle 
		 			*
		 			**
		 			***
		 			****
		 			*****
		 */
		for(int row = 1;row<=5;row++) {
			for (int column=1;column<=row;column++) {
				System.out.print("*");
			}System.out.println("");
		}
		System.out.println("---------Program Completed-------------");
	}
	public void printRightAngleTriangle1() 
	{	/*    Print with '*' A Right Angle Triangle 
		 			*
		 		   **
		 		  ***
		 		 ****
		 		*****
		 */
		for(int row = 1;row<=5;row++) 
		{
			for(int column=5;column>=1;column--)
			{
				int a=(column-row);
				if(a>=1)
				{
				System.out.print(" ");
				}				
			}
			for (int i=row;i>0;i--)
				{
				System.out.print("*");
				}System.out.println("");		
		}		
		System.out.println("---------Program Completed-------------");
	}
	public void reverseRightAngleTriangle() {
		for(int row = 5;row>=1;row--) {
			for(int column=1;column<=row;column++){
				System.out.print("*");
			}System.out.println(" ");
		}
		System.out.println("---------Program Completed-------------");
	}
	public void printNumRightAngleTriangle() {
		/*
		 *    1
		 *    12
		 *    123
		 *    1234
		 *    12345
		 */
		for(int row = 1;row<=5;row++) {
			for (int column=1;column<=row;column++) {
				System.out.print(""+column);
				if(row==column) {
					System.out.println("");
				}
			}
		}
		System.out.println("---------Program Completed-------------");
	}
	public void printNumInSequenceOfRightAngleTriangle() {
		/*
		 *    1
		 *    2 3
		 *    4 5 6
		 *    7 8 9 10
		 */
		int number = 1;
		for(int row = 1;row<=4;row++) 
		{
			for (int column=1;column<=row;column++) 
			{
				System.out.print(" "+number);
				number++;
					if(row!=column) 
					{
						System.out.print("");
					}
					else {
						System.out.println("");
					}
			}
		}
		System.out.println("---------Program Completed-------------");
	}
	
public void printEquiletralTriangle() {
	/*
	 * 			*
	 * 		   ***
	 * 		  *****
	 */
	int row,column,i;
	for(row=1;row<=5;row++) {
		for(column=5;column>=row;column--) {
			for(i=row;i<=(column-row);i++) {
				if(row>=i) {
					System.out.println("@");
				}else if(row<i) 
						{
							System.out.print("$");
						}
						else System.out.print("+");
			}//System.out.print("#");
		}//System.out.print("$");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day10AssignmentDoubleLoop obj = new Day10AssignmentDoubleLoop();
	//	obj.printRightAngleTriangle();
		obj.printRightAngleTriangle1();  
	//	obj.reverseRightAngleTriangle();
	//	obj.printNumRightAngleTriangle();
	//	obj.printNumInSequenceOfRightAngleTriangle();
		obj.printEquiletralTriangle();  // InComplete

	}

}
