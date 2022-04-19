package programs.stringPrograms;

import java.util.Scanner;

public class ChangeStringToLowerCase {

	public static void main(String[] args) {
		
		ChangeStringToLowerCase obj= new ChangeStringToLowerCase();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1=s.nextLine();
		System.out.println(obj.lowerCase(s1));
	}

	private String lowerCase(String s1) {
		String s="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')
			{
				s+=(char)(s1.charAt(i)+32);
			}
			else
			{
				s+=s1.charAt(i);
			}
		}
		return s;
		
	}
	}


