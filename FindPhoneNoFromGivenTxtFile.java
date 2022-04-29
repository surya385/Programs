package programs;
import java.io.*;
import java.util.Scanner;
import java.util.regex.*;
public class FindPhoneNoFromGivenTxtFile {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the text file path :");
		String givenPath=scan.nextLine();
		try {
		File file=new File(givenPath);
		FileReader r=new FileReader(file);
		String s=null;
		int c=-1;
		c=r.read();
		while(c!=-1)
		{
			s+=(char)c;
			c=r.read();
		}
		Pattern p=Pattern.compile("[0-9]{10}");
		Matcher m=p.matcher(s);
		int count=0;
		while(m.find())
		{
			count++;
			System.out.println("Phone no"+count+" :"+m.group());
		}
		if(count==0)
		System.out.println("Phone number not found in given text file");
		}catch(FileNotFoundException obj) {
			System.out.println("File not found");
		}catch (IOException e) {
		
			System.out.println("Given text file is not readable");
		}
	}

}
