package programs;
import java.util.Scanner;

public class LeftShiftArrayValues {

	public static void main(String[] args) {
		
		LeftShiftArrayValues obj=new LeftShiftArrayValues();
		int number[]= {1,2,3,4,5};
		obj.leftShift(number);
	}

	private void leftShift(int[] number) {
		System.out.println("How many times do you want to shift array values to left side");
		Scanner s=new Scanner(System.in);
		int noOfTimes=s.nextInt()%number.length;
		for(int no=1;no<=noOfTimes;no++)
		{
		int i=0;
		int temp=number[0];
		for(;i<number.length-1;i++)
		{
			number[i]=number[i+1];
		}
		number[i]=temp;
		}
		System.out.println("After Left Shift :");
		for(int j=0;j<number.length;j++)
		{
			
			System.out.print(number[j]+" ");
		}
				
	}


}
