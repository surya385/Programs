package numberPrograms;

import java.util.Scanner;

public class FindArmstrongNumbersFrom1ToGivenNumber {

	public static void main(String[] args) {
		FindArmstrongNumbersFrom1ToGivenNumber obj=new FindArmstrongNumbersFrom1ToGivenNumber();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to find armstrong numbers from 1 to given number :");
		int givenNo=s.nextInt();
		obj.checkArmstrong(givenNo);
	
	}
	private void checkArmstrong(int givenNo) {
		System.out.println("armstrong numbers from 1 to "+givenNo+" :");
		int a=1;
        while(a<=givenNo)
        {
        int no=a;
        int count=0;
		while(no>0)
		{
			no/=10;
			count ++;
		}
		int no2=a;
		int armstrong=0;
		while(no2>0)
		{
			int lastDigit=no2%10;
			armstrong+=Math.pow(lastDigit,count);
			no2/=10;
		}
		if(a==armstrong)
		{
			System.out.println(armstrong);
		}
		a++;
        }
	
	}

}
