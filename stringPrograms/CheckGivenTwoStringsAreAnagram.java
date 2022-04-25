package programs.stringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CheckGivenTwoStringsAreAnagram {

	public static void main(String[] args) {
		CheckGivenTwoStringsAreAnagram obj = new CheckGivenTwoStringsAreAnagram();
		System.out.println("Enter the first string :");
		Scanner scan= new Scanner(System.in);
		String givenString1=scan.nextLine();
		System.out.println("Enter the second string :");
		String givenString2=scan.nextLine();
		if(obj.checkAnagram(givenString1,givenString2))
			System.out.println(givenString1+" and "+givenString2+" are anagrams");
		else
			System.out.println(givenString1+" and "+givenString2+" are not anagrams");

	}

	public boolean checkAnagram(String givenString1, String givenString2) {
		char[] string1=givenString1.toLowerCase().toCharArray();
		char[] string2=givenString2.toLowerCase().toCharArray();
		Arrays.sort(string1);
		Arrays.sort(string2);
		if(string1.length!=string1.length)
			return false;
		else if(Arrays.equals(string1, string2))
			return true;
		else
			return false;
	}

}
