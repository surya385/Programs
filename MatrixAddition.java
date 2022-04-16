package programs;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		/*System.out.println("How many arrays do you want to add :");
		int count=s.nextInt();*/
		System.out.println("Enter how many row's for matrix :");
		int row=s.nextInt();
		System.out.println("Enter how many column's for matrix :");
		int col=s.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		for(int count=1;count<=2;count++)
		{
			System.out.println("Enter the values for array -"+count);
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					if(count==1)
						a[i][j]=s.nextInt();
					else
						b[i][j]=s.nextInt();
				}
			}
		}
		int c[][]=new int[row][col];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
			c[i][j]=a[i][j]+b[i][j];	
			}
		}
		
		System.out.println("Addition of two arrays :");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				System.out.print(c[i][j]+"	");
			}
			System.out.println();
		}
		
	}

}
