package programs.stringPrograms;

import java.util.Scanner;

public class FindIndexOfALetterInString {

	public static void main(String[] args) {
	
		FindIndexOfALetterInString obj = new FindIndexOfALetterInString();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1=s.nextLine();
		System.out.println("Enter a letter to find index :");
		char givenLetter=s.next().charAt(0);
		int index= obj.indexOfALetter(s1,givenLetter);
		if(index==-1)
			System.out.println("Letter not found");
		else
			System.out.println(givenLetter+" index is "+index);

	}

	public int indexOfALetter(String s1, char givenLetter) {
		for(int i=0;i<s1.length();i++)
		{
			if(givenLetter==s1.charAt(i))
				return i;
		}
		return -1;
	}

}
