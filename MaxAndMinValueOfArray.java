package programs;

import java.util.Scanner;

public class MaxAndMinValueOfArray {

	public static void main(String[] args) {
		
		MaxAndMinValueOfArray obj=new MaxAndMinValueOfArray();
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to compare");
		int count=s.nextInt();
		long number[]=new long[count];
		for(int i=0;i<count;i++)
		{
		number[i]=s.nextLong();
		}
		obj.max(number);
		obj.min(number);
		
	}

	private void max(long[] number) {
		long max=Long.MIN_VALUE;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>max)
			{
				max=number[i];
			}
		}
		System.out.println("Maximum value: "+max);
				
	}

	private void min(long[] number) {
		long min=Long.MAX_VALUE;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]<min)
			{
				min=number[i];
			}
		}
		System.out.println("Minimum Value "+min);
				
	}

}
