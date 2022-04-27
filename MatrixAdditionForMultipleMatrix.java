package programs;

import java.util.Scanner;

public class MatrixAdditionForMultipleMatrix { 

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("How many matrix do you want to add :"); 
		int count=s.nextInt(); 
		System.out.println("Enter how many row's for matrix :");
		int row=s.nextInt();
		System.out.println("Enter how many column's for matrix :");
		int col=s.nextInt();
		int a[][][]=new int[count][row][col];
		for(int k=0;k<a.length;k++)
		{
			System.out.println("Enter the values for matrix - "+(k+1));
			for(int i=0;i<a[k].length;i++)
			{
				for(int j=0;j<a[k][i].length;j++)
				{
					
					a[k][i][j]=s.nextInt();
					
				}
			}
		}
		int b[][]=new int[row][col];
		for(int k=0;k<a.length;k++)
		{
		for(int i=0;i<a[0].length;i++)
		{
			for(int j=0;j<a[0][0].length;j++)
			{
			b[i][j]+=a[k][i][j];	
			}
		}
		}
		
		System.out.println("Addition of given matrix :");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(b[i][j]+"	");
			}
			System.out.println();
		}
	}

}
