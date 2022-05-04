package programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfAllElementsInIntegerArray {

	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array :");
		int ar[]=new int[scan.nextInt()];
		System.out.println("Enter the values of array :");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=scan.nextInt();
		}
		int SumOfAllElements=0;
		for(int i:ar)
		{
			SumOfAllElements+=i;
		}
		System.out.println("Sum of all elements :" + SumOfAllElements);
		}
		catch(NegativeArraySizeException obj)
		{
			System.out.println("Enter only positive value for array length ");
		}
		catch (InputMismatchException obj) {
			System.out.println("Enter only numbers ");
		}
	}

}
