package programs;
import java.util.Scanner;
public class SortArrayElementsInAscendingOrder {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("How many values do you want to enter :");
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
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=0;j<numbers.length;j++)
			{
				if(numbers[i]<numbers[j])
				{
					temp=numbers[j];
					numbers[j]=numbers[i];
					numbers[i]=temp;
				}
			}
		}
		
		System.out.println("After sorting in ascending order :");
		for(int i=0;i<numbers.length;i++)
		{
			System.out.print(numbers[i]+" ");
		}
		
		
		
	}

}
