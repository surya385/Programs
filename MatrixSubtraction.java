package programs;

import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("How many matrix do you want to subtract :"); 
		int count=s.nextInt();
		System.out.println("Enter how many row's for matrix :");
		int row=s.nextInt();
		System.out.println("Enter how many column's for matrix :");
		int col=s.nextInt();
		int [][][] matrix=new int[count][row][col];
		for(int i=0;i<matrix.length;i++)
		{
			System.out.println("Enter the values for matrix - "+(i+1));
			for(int j=0;j<matrix[i].length;j++)
			{
				for(int k=0;k<matrix[i][j].length;k++)
				{
					matrix[i][j][k]=s.nextInt();
				}
			}
		}
		int[][] ans=new int[row][col];
		ans=matrix[0];
		for(int i=1;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				for(int k=0;k<matrix[i][j].length;k++)
				{
					ans[j][k]-=matrix[i][j][k];
				}
			}
		}
		System.out.println("Subtraction of given matrix :");
		for(int i=0;i<ans.length;i++)
		{
			for(int j=0;j<ans[i].length;j++)
			{
				System.out.print(ans[i][j]+"	");
			}
			System.out.println();
		}
		

	}

}
