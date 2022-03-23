package numberPrograms;

import java.util.Scanner;

public class SwapTwoNoWithoutThirdVariable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a first no to swap no1 :");
		int no1=s.nextInt();
		System.out.println("Enter a second no to swap no2 :");
		int no2=s.nextInt();
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("no1 ="+no1);
		System.out.println("no2 ="+no2);
	}

}
