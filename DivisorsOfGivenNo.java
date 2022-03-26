package programs;

import java.util.Scanner;

public class DivisorsOfGivenNo {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter a number :");
		int givenNo=a.nextInt();
		System.out.println("Divisors of given number :");
		int divisor=1;
		while(divisor<=givenNo)
		{
			if((givenNo%divisor)==0)
			{
				System.out.println(divisor);
			}
			divisor++;
		}
		
	}

}
