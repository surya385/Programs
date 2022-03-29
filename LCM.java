//LCM :the least common multiple of two numbers.
package programs;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number :");
		int givenNo1=s.nextInt();
		System.out.println("Enter second number :");
		int givenNo2=s.nextInt();
		LCM obj=new LCM();
		obj.findLCM(givenNo1,givenNo2);
		
	}

	private void findLCM(int givenNo1, int givenNo2) {
		int LCM=givenNo1>givenNo2?givenNo1:givenNo2;
		while(true)
		{
			if((LCM%givenNo1==0)&&(LCM%givenNo2==0))
			{
				System.out.println("LCM for given numbers :"+LCM);
				break;
			}
			LCM++;
		}
	}

}
