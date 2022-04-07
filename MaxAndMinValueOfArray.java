package programs;

import java.util.Scanner;

public class MaxAndMinValueOfArray {

	public static void main(String[] args) {
		
		MaxAndMinValueOfArray obj=new MaxAndMinValueOfArray();
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to compare");
		int count=s.nextInt();
		int number[]=new int[count];
		for(int i=0;i<count;i++)
		{
		System.out.println("Enter the number");
		number[i]=s.nextInt();
		}
		obj.max(number);
		obj.min(number);
		
	}

	private void max(int[] number) {
		int max=0;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>max)
			{
				max=number[i];
			}
		}
		System.out.println("Maximum value: "+max);
				
	}

	private void min(int[] number) {
		int min=number[0];
		for(int i=1;i<number.length;i++)
		{
			if(number[i]<min)
			{
				min=number[i];
			}
		}
		System.out.println("Minimum Value "+min);
				
	}

}
