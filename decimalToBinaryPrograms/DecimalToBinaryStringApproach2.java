package numberPrograms.decimalToBinaryPrograms;

import java.util.Scanner;

public class DecimalToBinaryStringApproach2 {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		DecimalToBinaryStringApproach2 obj=new DecimalToBinaryStringApproach2();
		System.out.println("Enter decimal number to convert binary");
		int givenNo=s.nextInt();
		System.out.println("Binary for given no:");
		System.out.println(Integer.toBinaryString(givenNo));
	}

	
}
