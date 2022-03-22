package numberPrograms;
import java.util.Scanner;
public class CheckArmstrongNo {

	public static void main(String[] args) {
		
		CheckArmstrongNo obj=new CheckArmstrongNo();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number to check armstrong :");
		int givenNo=s.nextInt();
		int power=obj.count(givenNo);
		int no=obj.Armstrong(givenNo,power);
		obj.checkArmstrong(givenNo,no);
	}

	private void checkArmstrong(int givenNo, int no) {
		if(givenNo==no)
		{
			System.out.println("Given number is armstrong");
		}
		else
		{
			System.out.println("Given number is not armstrong");
		}
	}

	private int count(int givenNo) 
	{

		int count=0;
		while(givenNo>0)
		{
			givenNo/=10;
			count ++;
		}
		return count;
		
	}

	private int Armstrong(int givenNo,int power) {
		
		int no=0;
		while(givenNo>0)
		{
			int lastDigit=givenNo%10;
			no+=Math.pow(lastDigit,power);
			givenNo/=10;
		}
	  return no;
	}

}
