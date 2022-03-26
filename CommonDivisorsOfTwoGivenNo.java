package programs;

import java.util.Scanner;

public class CommonDivisorsOfTwoGivenNo {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter first number :");
		int givenNo1=a.nextInt();
		System.out.println("Enter second number :");
		int givenNo2=a.nextInt();
		System.out.println("Divisors of two numbers :");
		int givenNo=givenNo1>givenNo2?givenNo2:givenNo1;
		int commonDivisor=1;
		while(commonDivisor<=givenNo)
		{
			if((givenNo1%commonDivisor)==0&&(givenNo2%commonDivisor)==0)
			{
				System.out.println(commonDivisor);
			}
			commonDivisor++;
		}
	}

}
