package numberPrograms;

import java.util.Scanner;

public class AdditionAndCountOfDigits {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter No :");
		int a=obj.nextInt();
		AdditionAndCountOfDigits b=new AdditionAndCountOfDigits();
		b.countOfDigits(a);
		b.additionOfDigits(a);
	}
	void countOfDigits(int a)
	{
		int count=0;
		while(a>0)
		{
			a/=10;
			count++;
		}
		System.out.println("no of digits :"+count);
		
	}
	
	void additionOfDigits(int a)
	{
		int b=0;
		while(a>0)
		{
		b+=a%10;
		a/=10;
	}
	System.out.println("addition of digits :"+b);
	}


}

