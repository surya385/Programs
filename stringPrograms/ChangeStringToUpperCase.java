package programs.stringPrograms;

import java.util.Scanner;

public class ChangeStringToUpperCase {

	public static void main(String[] args) {
		
		ChangeStringToUpperCase obj= new ChangeStringToUpperCase();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1=s.nextLine();
		System.out.println(obj.upperCase(s1));
	}

	private String upperCase(String s1) {
		String s="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
			{
				s+=(char)(s1.charAt(i)-32);
			}
			else
			{
				s+=s1.charAt(i);
			}
		}
		return s;
		
	}

}
