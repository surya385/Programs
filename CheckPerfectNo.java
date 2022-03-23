package numberPrograms;

import java.util.Scanner;

public class CheckPerfectNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		CheckPerfectNo obj=new CheckPerfectNo();
		System.out.println("Enter a number :");
		int givenNo=s.nextInt();
		obj.perfectNo(givenNo);
	}

	private void perfectNo(int givenNo) {
		int no=1;
		int total=0;
		while(no<givenNo)
		{
			int reminder=givenNo%no;
			if(reminder==0)
			{
				total+=no;
			}
			no++;
		}
		if (givenNo==total)
		{
			System.out.println("Given no is perfect number");
		}
		else
		{
			System.out.println("Given no is not perfect number");
		}
	}
	

}
