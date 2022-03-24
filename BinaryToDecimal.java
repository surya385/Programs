package numberPrograms;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		BinaryToDecimal obj=new BinaryToDecimal();
		System.out.println("Enter binary numbers to convert decimal");
		int givenNo=s.nextInt();
		obj.binaryToDecimal(givenNo);
	}

	private void binaryToDecimal(int givenNo) {
		
		int reminder=0;
		int decimalNo=0;
		int pow=0;
		while(givenNo>0)
		{
			reminder=givenNo%10;
			decimalNo+=reminder*Math.pow(2, pow);
			givenNo/=10;
			pow++;
			
		}
		System.out.println("Decimal :");
		System.out.println(decimalNo);
	}

}
