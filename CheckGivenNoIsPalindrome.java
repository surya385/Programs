package numberPrograms;

import java.util.Scanner;

public class CheckGivenNoIsPalindrome{

	public static void main(String[] args) {
		
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the number to check polindrom :");
		int givenNo=a.nextInt();
		CheckGivenNoIsPalindrome obj = new CheckGivenNoIsPalindrome();
		int reversedNo=obj.reverseNo(givenNo);
		obj.checkPolindrom(givenNo,reversedNo);
		a.close();
	}

	private void checkPolindrom(int givenNo,int reversedNo) {

		if(givenNo==reversedNo)
		  {
			  System.out.println("Given No Is Palindrome");
		  }
		  else
		  {
			  System.out.println("Given No Is Not Palindrome");
		  }
	}

	private int reverseNo( int givenNo) {
		
		int reversedNo=0;
		while(givenNo>0)
		{
			int lastDigit=givenNo%10;
			reversedNo=(reversedNo*10)+lastDigit;
			
			givenNo/=10;
		}
	  return reversedNo;
	}
}
