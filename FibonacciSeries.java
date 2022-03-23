package numberPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		FibonacciSeries obj=new FibonacciSeries();
		System.out.println("Enter a number to get fibonacci series from 0 to given no :");
		int givenNo=s.nextInt();
		obj.fibonacciSeries(givenNo);
	}

	private void fibonacciSeries(int givenNo) {
		System.out.println("Fibonacci Series:");
		int a=-1,b=1;
		int no=0;
		while(no<givenNo)
		{
			no=a+b;
			System.out.println(no);
			a=b;
			b=no;
		}
		
	}

}
