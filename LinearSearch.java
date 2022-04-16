package programs;

import java.util.Scanner;

public class LinearSearch {

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
		System.out.println("Enter the search value :");
		int value=s.nextInt();
		boolean valueFound=false;
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==value)
			{
				System.out.println(value+" Found at index :"+i);
				valueFound=true;
				break;
			}
		}
		if(valueFound==false)
		{
			System.out.println(value+" doesn't exist in array ");
		}
	}

}
