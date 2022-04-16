package programs;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements :");
		int count=s.nextInt();
		int numbers[]=new int[count];
		System.out.println("Enter the "+count+" values :");
		for(int i=0;i<count;i++)
		{
			numbers[i]=s.nextInt();
		}
		
		int temp=0;
		for(int i=1;i<numbers.length;i++)
		{
			for(int j=0;j<numbers.length-i;j++)
			{
				if(numbers[j]>numbers[j+1])
				{
					temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
			}
		}
		
		System.out.println("Enter the search value :");
		int value=s.nextInt();
		int max=numbers.length-1;
		int min=0;
		while(min<=max) {
		int mid=(max+min)/2;
		if(value==numbers[mid])
		{
			System.out.println(value+" is found at index "+mid);
			break;
		}
		else if(value>numbers[mid])
		{
			min=mid+1;
		}
		else if(value<numbers[mid])
		{
			max=mid-1;
		}
		}
		if(min>max)
		{
			System.out.println(value+ " is not found");
		}
	}

}
