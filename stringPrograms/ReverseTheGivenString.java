package programs.stringPrograms;
import java.util.Scanner;

public class ReverseTheGivenString {

	public static void main(String[] args) {
		
		ReverseTheGivenString obj=new ReverseTheGivenString();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a string");
		String givenString=scan.nextLine();
		System.out.println("Reversed string :");
		System.out.println(obj.stringReverse(givenString));

	}

	private String stringReverse(String givenString) {
		
		String reversedString="";
		for(int i=givenString.length()-1;i>=0;i--)
			reversedString+=givenString.charAt(i);
		return reversedString;
	}

}
