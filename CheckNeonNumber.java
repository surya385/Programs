package numberPrograms;

import java.util.Scanner;

public class CheckNeonNumber {

	public static void main(String[] args) {

		CheckNeonNumber obj=new CheckNeonNumber();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number :");
		int givenNo=s.nextInt();
		int squareOfGivenNo=0;
		squareOfGivenNo+=Math.pow(givenNo,2);
		int sumOfDigitsOfSquare=obj.sumOfDigitsOfSquare(squareOfGivenNo);
		
		if(givenNo==sumOfDigitsOfSquare)
		{
			System.out.println("Given number is neon number");
		}
		else
		{
			System.out.println("Given number is not neon number");
		}

		
	}

	private int sumOfDigitsOfSquare(int squareOfGivenNo) {
		int sumOfDigitsOfSquare=0;
		
		while(squareOfGivenNo>0)
		{
			int lastDigit=squareOfGivenNo%10;
			sumOfDigitsOfSquare+=lastDigit;
			squareOfGivenNo/=10;
			
			
		}
		return sumOfDigitsOfSquare;
	}

}
