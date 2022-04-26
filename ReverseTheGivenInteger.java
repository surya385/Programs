package programs;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseTheGivenInteger { 

	public static void main(String[] args) {
		ReverseTheGivenInteger obj=new ReverseTheGivenInteger();
		System.out.println("Enter a number :");
		Scanner scan=new Scanner(System.in);
		try {
		int givenNo=scan.nextInt();
		System.out.println("After reversing :"+obj.reverseInt(givenNo));
		}

		catch(InputMismatchException a) {
			System.out.println("Enter number only");
			
		}
	}

	private int reverseInt(int givenNo) {

		int reminder=0;
		int reversedInt=0;
		while(givenNo>0)
		{
			reminder=givenNo%10;
			reversedInt=(reversedInt*10)+reminder;
			givenNo/=10;
			
		}
		return reversedInt; 
	}
	

}
