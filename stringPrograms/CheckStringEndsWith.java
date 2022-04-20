package programs.stringPrograms;

import java.util.Scanner;

public class CheckStringEndsWith {

	public static void main(String[] args) {
		
		CheckStringEndsWith obj = new CheckStringEndsWith();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string :");
		String s1=s.nextLine();
		System.out.println("Enter the second string to check the first string ends with this string :");
		String s2=s.nextLine();
		s.close();
		if(s2.length()>s1.length())
		{
			System.out.println("Second string has more letters comparing first string");
		}
		else
		{
		boolean stringStartsWith=obj.checkStartsWith(s1,s2);
		if(stringStartsWith)
			System.out.println(s1+" ends with "+s2);
		else
			System.out.println(s1+" not ends with "+s2);
		}
	}

	private boolean checkStartsWith(String s1, String s2) {
		
		
		for(int i=1;i<=s2.length();i++)
		{
			if(s1.charAt(s1.length()-i)!=s2.charAt(s2.length()-i))
				return false;
		}
		return true;
		
		
	}
	

}
