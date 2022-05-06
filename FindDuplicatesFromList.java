package programs;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class FindDuplicatesFromList {

	public static void main(String[] args) {
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of list :");
		int size=scan.nextInt();
		scan.nextLine();
		ArrayList al = new ArrayList();
		for(int i=1;i<=size;i++)
    	al.add(scan.nextLine());
    	System.out.println(al);
    	LinkedHashSet lhs = new LinkedHashSet(); 
    	System.out.println("Duplicates :");
    	for(Object ob:al)
    	{ 
    	if(lhs.add(ob)!=true)
    		System.out.println(ob);
    	} 
		}
		catch(InputMismatchException obj)
		{
			System.out.println("Enter number only");
		}

	}

}
