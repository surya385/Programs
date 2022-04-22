package programs;

import java.util.Scanner;

public class SecondMaxAndSecondMinValueOfArray {

	public static void main(String[] args) {
		
		SecondMaxAndSecondMinValueOfArray obj=new SecondMaxAndSecondMinValueOfArray();
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to compare");
		int count=s.nextInt();
		long number[]=new long[count];
		for(int i=0;i<count;i++)
		{
		number[i]=s.nextLong();
		}
		obj.secondMax(number);
		obj.secondMin(number);
		
	}

	private void secondMax(long[] number) {
		long max =Long.MIN_VALUE;	
		long secondMax =Long.MIN_VALUE; 
		for(int i=0;i<number.length;i++)
		{
		if(number[i]>max){
			secondMax = max;
			max = number[i]; 
		}
		else if(number[i]>secondMax&&number[i]!=max)
		{
		secondMax = number[i]; 
		}
		}
		System.out.println("Maximum value:"+max);
		System.out.println("Second maximum value: " +secondMax); 
		
				
	}

	private void secondMin(long[] number) {

		long min =Long.MAX_VALUE;	
		long secondMin =Long.MAX_VALUE; 
		for(int i=0;i<number.length;i++)
		{
		if(number[i]<min){
			secondMin = min;
			min = number[i]; 
		}
		else if(number[i]<secondMin&&number[i]!=min)
		{
		secondMin = number[i]; 
		}
		}
		System.out.println("Minimum value:"+min);
		System.out.println("Second minimum value: "+secondMin); 
	}
	}


