package programs;

import java.util.Scanner;

public class GreatestCommonDivisorOfTwoGivenNo {

	public static void main(String[] args) {
		GreatestCommonDivisorOfTwoGivenNo obj=new GreatestCommonDivisorOfTwoGivenNo();
		obj.greatestCommonDivisor();
	}

	private void greatestCommonDivisor() {
		Scanner a=new Scanner(System.in);
		System.out.println("Enter first number :");
		int givenNo1=a.nextInt();
		System.out.println("Enter second number :");
		int givenNo2=a.nextInt();
		int givenNo=givenNo1>givenNo2?givenNo2:givenNo1;
		int commonDivisor=1;
		int greatestCommonDivisor=0;
		while(commonDivisor<=givenNo)
		{
			if((givenNo1%commonDivisor)==0&&(givenNo2%commonDivisor)==0)
			{
				greatestCommonDivisor=commonDivisor;
			}
			commonDivisor++;
		}
		System.out.println("GreatestCommon Divisor of two numbers :"+greatestCommonDivisor);
	}

}
