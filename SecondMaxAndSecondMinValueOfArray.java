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
		int max =-2147483648;	//Minimum value for a variable of type int
		int secondMax =-2147483648; 
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

	private void secondMin(int[] number) {

		int min =2147483647;	//Maximum value for a variable of type int
		int secondMin =2147483647; 
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


