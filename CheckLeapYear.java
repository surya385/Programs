package programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String[] args) {
	try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the year :");
		int givenYear=scan.nextInt();
		scan.close();
		//1st con
		if(givenYear%400==0||(givenYear%4==0&&givenYear%100!=0))
			// 1st condition check - It is century leap year
	        // 2nd condition check - It is leap year and not century year
			System.out.println(givenYear+" is leap year");
		else
			System.out.println(givenYear+" is non - leap year");
	}
	catch(InputMismatchException obj)
	{
		System.out.println("Enter year in numbers");
	}
}
}
