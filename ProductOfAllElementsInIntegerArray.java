package programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductOfAllElementsInIntegerArray {

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
			int ProductOfAllElements=1;
			for(int i:ar)
			{
				ProductOfAllElements*=i;
			}
			System.out.println("Product of all elements :" + ProductOfAllElements);
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
