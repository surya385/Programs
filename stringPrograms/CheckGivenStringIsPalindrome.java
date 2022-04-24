package programs.stringPrograms;

import java.util.Scanner;

public class CheckGivenStringIsPalindrome {

	public static void main(String[] args) {
		
		CheckGivenStringIsPalindrome obj=new CheckGivenStringIsPalindrome();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string to check palindrome :");
		String givenString=scan.next();
		obj.checkPalindrome(givenString);

	}
	public void checkPalindrome(String givenString)
	{
		String reversedString="";
		for(int i=givenString.length()-1;i>=0;i--)
		{
			reversedString+=givenString.charAt(i);
		}
		if(givenString.equals(reversedString))
			System.out.println(givenString+" is palindrome ");
		else
			System.out.println(givenString+" is not palindrome");
	}

}
