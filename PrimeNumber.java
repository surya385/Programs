/*Prime numbers are the numbers that have only two factors, 
that are, 1 and the number itself.that is not a product of other two smaller numbers.*/

package programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to check prime number:");
		int givenNo=s.nextInt();
		PrimeNumber obj=new PrimeNumber();
		obj.checkPrimeNumber(givenNo);
	}

	private void checkPrimeNumber(int givenNo) {
		int no=2;
		boolean prime=true;
		while(no<givenNo)
		{
			if(givenNo%no==0)
			{
				System.out.println("Given number is not prime number");
				prime=false;
				break;
			}
			no++;
		}
		if(prime)System.out.println("Given number is prime number");		
	}

}
