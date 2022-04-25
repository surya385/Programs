package programs.stringPrograms;

import java.util.Scanner;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		System.out.println("Enter a string :");
		Scanner scan= new Scanner(System.in);
		String givenString=scan.nextLine();
		String s=""+givenString.charAt(0);

		for(int i=1;i<givenString.length();i++)
		{
			boolean repeatedCharacter=false;  
			for(int j=0;j<s.length();j++)
			{
				if(givenString.charAt(i)==s.charAt(j))
				{
					repeatedCharacter=true;
					break;
				}
			}
			if(repeatedCharacter!=true)
				s+=givenString.charAt(i);
		}
		System.out.println("After removing duplicate characters :");
		System.out.println(s);

	}

}
