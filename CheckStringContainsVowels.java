package programs;

import java.util.Scanner;

public class CheckStringContainsVowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String givenString=scan.nextLine();
		
		if(checkVowels(givenString))
		System.out.println("Given string contains vowels");
		else
			System.out.println("Given string not contains vowels");
		
	}
	public static boolean checkVowels(String s)
	{ 
		return s.toLowerCase().matches(".*[aeiou].*");
	}

}
