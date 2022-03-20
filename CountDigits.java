package numberPrograms;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter No :");
		int a=obj.nextInt();
		CountDigits b=new CountDigits();
		b.countDigit(a);
		b.add(a);
	}
	void countDigit(int a)
	{
		int count=0;
		while(a>0)
		{
			a/=10;
			count++;
		}
		System.out.println("no of digits :"+count);
		
	}
	
	void add(int a)
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

