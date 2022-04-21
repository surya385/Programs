package programs.stringPrograms;

import java.util.Scanner;

public class CheckStringContainsGivenInput {

	public static void main(String[] args) {
		
		CheckStringContainsGivenInput obj = new CheckStringContainsGivenInput();
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = s.nextLine();
		System.out.println("Enter a another string to check the first contains this string :");
		String s2= s.nextLine();
		boolean stringContainsGivenInput=obj.checkStringContains(s1,s2);
		if(stringContainsGivenInput)
			System.out.println(s1+" contains "+s2);
		else
			System.out.println(s1+" not contains "+s2);
		
	}

	public boolean checkStringContains(String s1, String s2) {
		
		boolean a=false;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==s2.charAt(0))
			{
				if(s2.length()==1)
				{
					return true;
				}
				for(int j=1;j<s2.length();j++)
				{
					if(s1.charAt(i+j)==s2.charAt(j))
						{
						a=true;
						}
					else {
						a=false;
						break;
					}
				}
				if(a==true)break;
			}
		}
		return a;
	}

}
