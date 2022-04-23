package programs.stringPrograms;

import java.util.Scanner;

public class CountTheOccuranceOfEachCharacter {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string :");
		String givenString=s.nextLine(); 
		int[] countOfLetter = new int[givenString.length()];  
		for(int j =0;j<givenString.length();j++)
		{ 
		int count = 1;
		for(int i=j+1; i<givenString.length(); i++)
		{
		if(givenString.charAt(j)==givenString.charAt(i))
			{
			count++; 
			countOfLetter[i] = -1; 
			}
		} 
		if(countOfLetter[j]!=-1)
		countOfLetter[j]= count;  
		}
		System.out.println("Count of letter :");
		for(int i=0;i<countOfLetter.length;i++)
		{
			if(countOfLetter[i]!=-1)
				System.out.println(givenString.charAt(i) +" ----> "+countOfLetter[i]);
		} 
	}

}
