package programs;

import java.util.Scanner;

public class FindDuplicatesInIntegerArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the length of array :"); 
		int[] array = new int[s.nextInt()];
		System.out.println("Enter the values of array :");
		for(int i=0;i<array.length;i++)
			array[i]=s.nextInt();
		findDuplicates(array);

	}
	
	private static void findDuplicates(int[] array) {
	int[] duplicates=new int[array.length];
	for(int i =0;i<array.length;i++)
	{ 
	for(int j=i+1; j<array.length; j++)
	{
	if(array[i]==array[j])
		{
		duplicates[j] = 1; 
		}
	} 		
	}
	System.out.println("Dublicates :");
	boolean noDuplicates=true;
	for(int i=0;i<array.length;i++)
	{
		if(duplicates[i]==1)
		{
			System.out.println(array[i]);
			noDuplicates=false;
		}
		
	} 
	if(noDuplicates)
		System.out.println("No duplicates");
	}
}
