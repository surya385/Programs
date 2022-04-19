package programs.stringPrograms;

import java.util.Scanner;

public class CheckTwoStringsAreSame {

	public static void main(String[] args){
		
		CheckTwoStringsAreSame obj=new CheckTwoStringsAreSame();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string :");
		String s1=s.nextLine();
		System.out.println("Enter the Second string to compare:");
		String s2=s.nextLine();
		boolean twoStringsAreSame=obj.compareTwoStrings(s1,s2);
		if(twoStringsAreSame)
		System.out.println("Two strings are same ");
		else	
		System.out.println("Two strings are not same ");
	}

	private boolean compareTwoStrings(String s1, String s2) {
		
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else {
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				return false; 
			}
			
		}
		return true;
	}}

}
