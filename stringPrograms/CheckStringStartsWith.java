package programs.stringPrograms;

import java.util.Scanner;

public class CheckStringStartsWith {

	public static void main(String[] args) {
		
		CheckStringStartsWith obj = new CheckStringStartsWith();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string :");
		String s1=s.nextLine();
		System.out.println("Enter the second string to check the first string starts with this string :");
		String s2=s.nextLine();
		if(obj.checkStartsWith(s1,s2))
			System.out.println(s1+" starts with "+s2);
		else
			System.out.println(s1+" not starts with "+s2);
	}

	public boolean checkStartsWith(String s1, String s2) {
		if(s2.length()>s1.length())
			return false;
		else
		{
		for(int i=0;i<s2.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
			return true;
		}
		
	}
}
