package numberPrograms.decimalToBinaryPrograms;

import java.util.Scanner;

public class DecimalToBinaryStringApproach1 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		DecimalToBinaryStringApproach1 obj=new DecimalToBinaryStringApproach1();
		System.out.println("Enter decimal number to convert binary");
		int givenNo=s.nextInt();
		System.out.println("Binary for given no:");
		System.out.println(obj.becimalToBinary(givenNo));
	}

	private String becimalToBinary(int givenNo) {
		String binary="";
		int reminder =0;
		while(givenNo>0)
		{
			reminder=givenNo%2;
			binary=reminder+binary;
			givenNo/=2;
		}
		return binary;
	}

}
