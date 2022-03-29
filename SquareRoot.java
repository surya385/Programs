/*The square root of a number is the factor that we can multiply
by itself to get that number.*/

package programs;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a Square number :");
		int givenNo=s.nextInt();
		SquareRoot obj=new SquareRoot();
		obj.findSSquareRoot(givenNo);
		
		
	}

	private void findSSquareRoot(int givenNo) {
		int squareRoot=1;
		boolean givenNoIsNotSquare=true;
		while(squareRoot<=givenNo)
		{
			if(givenNo/squareRoot==squareRoot&&givenNo%squareRoot==0)
			{
				System.out.println("Square root = "+squareRoot);
				givenNoIsNotSquare=false;
				break;
				
			}
			squareRoot++;
		}
		if(givenNoIsNotSquare)System.out.println("Given number is not square number");
	}

}
