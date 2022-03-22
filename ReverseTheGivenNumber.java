package numberPrograms;

import java.util.Scanner;

public class ReverseTheGivenNumber {

	public static void main(String[] args) {
		ReverseTheGivenNumber obj= new ReverseTheGivenNumber();
		Scanner a=new Scanner(System.in);
		System.out.println("Enter the numbers to reveres :");
		int no=a.nextInt();
		obj.reverse(no);
		a.close();
	}

	private void reverse(int no) {
		
		System.out.println("after reversed :");
		while(no>0)
		{
			System.out.print(no%10);
			no/=10;
		}
		
	}

}
