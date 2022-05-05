package programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortingStringArrayInReverseAlphabeticOrder implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=(String)o2;
		int result=s1.compareTo(s2);
		if(result>0)
			return -1;
		else if(result<0)
			return 1;
		else
			return 0;
	}

	public static void main(String[] args) {
		SortingStringArrayInReverseAlphabeticOrder obj=new SortingStringArrayInReverseAlphabeticOrder();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter array length :");
		String[] str=new String[scan.nextInt()];
		System.out.println("Enter strings :");
		
		for(int i=0;i<str.length;i++)
			str[i]=scan.nextLine();
		Arrays.sort(str,obj);
		for(String s:str)
		System.out.println(s);
		

	}

}
