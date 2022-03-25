package numberPrograms.decimalToBinaryPrograms;

import java.util.Scanner;

public class DecimalToBinaryPowerApproach {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		DecimalToBinaryPowerApproach obj=new DecimalToBinaryPowerApproach();
		System.out.println("Enter decimal number to convert binary");
		int givenNo=s.nextInt();
		System.out.println("Binary for given no:");
		System.out.println(obj.becimalToBinary(givenNo));
	}

	private int becimalToBinary(int givenNo) {
		
		int binary=0;
		int reminder=0;
		int power=0;
		while(givenNo>0)
		{
			reminder=givenNo%2;
			binary+=reminder*power(10,power);
			givenNo/=2;
			power++;
			
		}
		
		return binary;
				
	}
	public static int power(int base,int power)
	{
		int total=1;
		while(power>0)
		{
			total*=base;
			power--;
		}
		return total;
	}
	

}
