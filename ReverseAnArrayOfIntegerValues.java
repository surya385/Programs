package programs;
import java.util.Scanner;

public class ReverseAnArrayOfIntegerValues {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int arraySize=0;
		int[] array=new int[0];
		arraySize=scan.nextInt();	
		array=new int[arraySize];
		System.out.println("Enter the values for array :");
		for(int i=0;i<array.length;i++)
		{
			array[i]=scan.nextInt();
		}
		int[] reversedArray=new int[arraySize];
		int i=0;
		for(int j=array.length-1;j>=0;j--)
		{
			reversedArray[i]=array[j];
			i++;
		}
		System.out.println("Reversed array values :");
		for(int k:reversedArray)
		{
			System.out.print(k+" ");
		}

	}

}
