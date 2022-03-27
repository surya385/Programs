//a number whose sum and product of all digits are equal is called a spy number.
package programs;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SpyNumber obj=new SpyNumber();
		System.out.println("Enter a number :");
		int givenNo=s.nextInt();
		obj.checkSpyNo(givenNo);
	}

	private void checkSpyNo(int givenNo) {
		int sumOfDigits=0;
		int productOfDigits=1;
		while(givenNo>0)
		{
			sumOfDigits+=givenNo%10;
			productOfDigits*=givenNo%10;
			givenNo/=10;
		}
		if(sumOfDigits==productOfDigits)
		{
			System.out.println("Given number is spy number");
		}
		else
		{
			System.out.println("Given number is not spy number");
		}
	}

}
