package programs;
import java.util.Scanner;
public class BubbleSortInAscendingOrder {

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
		System.out.println("Before sorting :");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		int temp=0;
		
		for(int i=1;i<numbers.length;i++)
		{
			for(int j=0;j<numbers.length-i;j++)
				if(numbers[j]>numbers[j+1])
				{
					temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
				}
		}
		
		
		System.out.println("Sorted array in ascending order:");
		for(int i:numbers)
		{
			System.out.print(i+" ");
		}
		
		
		
	}

}
