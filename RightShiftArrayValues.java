package programs;

import java.util.Scanner;

public class RightShiftArrayValues {

	public static void main(String[] args) {
		
		RightShiftArrayValues obj=new RightShiftArrayValues();
		int number[]= {1,2,3,4,5};
		obj.rightShift(number);
	}
	
	private void rightShift(int[] number) {
		System.out.println("How many times do you want to shift array values to right side");
		Scanner s=new Scanner(System.in);
		int noOfTimes=s.nextInt()%number.length;
		for(int no=1;no<=noOfTimes;no++)
		{
		int i=number.length-1;
		int temp=number[i];
		for(;i>0;i--)
		{
			number[i]=number[i-1];
		}
		number[i]=temp;
		}
		System.out.println("\nAfter Right Shift :");
		for(int j=0;j<number.length;j++)
		{
			System.out.print(number[j]+" ");
		}
				
	}

}
