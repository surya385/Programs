package numberPrograms;

import java.util.Scanner;

public class FactorialForGivenNumber {

	public static void main(String[] args) {
		Scanner a= new Scanner(System.in);
		FactorialForGivenNumber obj=new FactorialForGivenNumber();
		System.out.println("Enter a number :");
		int givenNo=a.nextInt();
		obj.factorial(givenNo);
	}

	private void factorial(int givenNo) {

		int no=1;
		int factorial=1;
		while(no<=givenNo)
		{
			factorial*=no;
			no++;
		}
		System.out.println("Factorial for given no :"+factorial);
	}

}
