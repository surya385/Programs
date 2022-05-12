package programs;

import java.util.Scanner;

public class RemoveDuplicatesFromInteger {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a integer :");
		int givenNo=scan.nextInt();
		scan.close();
		int temp=givenNo,count=0;
		while(temp>0)
		{
			temp/=10;
			count++;
		}
		int[] array=new int[count];
		for(int i=array.length-1;i>=0;i--)
		{
			array[i]=givenNo%10;
			givenNo/=10;
		}
		char[] duplicates=new char[count];
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
					duplicates[j]='d';
			}
		}
		System.out.println("Given integer without duplicates: ");
		for(int i=0;i<array.length;i++)
		{
			if(duplicates[i]!='d')
				System.out.print(array[i]);
		}
		

	}

}
