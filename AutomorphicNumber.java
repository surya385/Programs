/*An Automorphic number is a number whose square “ends” in the same digits as the number itself.
Examples: 5*5 = 25, 6*6 = 36, 25*25 = 625*/

package programs;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		AutomorphicNumber obj=new AutomorphicNumber();
		System.out.println("Enter a number :");
		int givenNo=s.nextInt();
		obj.checkAutomorphicNumber(givenNo);
	}

	private void checkAutomorphicNumber(int givenNo) {
		int no=givenNo;
		int count=0;
		while(no>0)
		{
			no/=10;
			count++;
		}
		int sqrNum =givenNo*givenNo;
		int sqrNumLastDigit=sqrNum%(int)Math.pow(10,count);
		if(sqrNumLastDigit==givenNo)
		{
			System.out.println("Given number is Automorphic Number");
		}
		else
		{
			System.out.println("Given number is not Automorphic Number");
		}
	}

}
