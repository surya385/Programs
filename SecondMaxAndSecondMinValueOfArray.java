package programs;

import java.util.Scanner;

public class SecondMaxAndSecondMinValueOfArray {

	public static void main(String[] args) {
		
		SecondMaxAndSecondMinValueOfArray obj=new SecondMaxAndSecondMinValueOfArray();
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to compare");
		int count=s.nextInt();
		int number[]=new int[count];
		for(int i=0;i<count;i++)
		{
		System.out.println("Enter the number");
		number[i]=s.nextInt();
		}
		obj.secondMax(number);
		obj.secondMin(number);
		
	}

	private void secondMax(int[] number) {
		int max=0;
		for(int i=0;i<number.length;i++)
		{
			if(number[i]>max)
			{
				max=number[i];
			}
		}
		boolean secondMaxFound=false;
		for(int secondMax=max-1;secondMax>=0;secondMax--)
		{
			for(int i=0;i<number.length;i++)
			{
				if(secondMax==number[i])
				{
					System.out.println("Second maximum value: "+secondMax);
					secondMaxFound=true;
					break;
				}
			}
			if(secondMaxFound==true)
			{
				break;
			}
		}
		
				
	}

	private void secondMin(int[] number) {
		int min=number[0];
		for(int i=1;i<number.length;i++)
		{
			if(number[i]<min)
			{
				min=number[i];
			}
		}
		boolean secondMinFound=false;
		for(int secondMin=min+1;;secondMin++)
		{
			for(int i=0;i<number.length;i++)
			{
				if(secondMin==number[i])
				{
					System.out.println("Second minimum value: "+secondMin);
					secondMinFound=true;
					break;
				}
			}
			if(secondMinFound==true)
			{
				break;
			}
		}
	}
	}


