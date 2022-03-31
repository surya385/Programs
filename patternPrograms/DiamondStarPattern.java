package programs.patternPrograms;

public class DiamondStarPattern {

	public static void main(String[] args) {
		
		for(int c=7;c>=1;c--)
		{
		for(int a=1;a<=c;a++)
		{
			System.out.print(" ");
		}
		for(int b=7;b>=c;b--)
		{
			System.out.print("*");
		}
		for(int d=7;d>c;d--)
		{
			System.out.print("*");
		}
		System.out.println();
		}
		
		
		
		for(int c=7;c>=1;c--)
		{
		for(int b=7;b>=c;b--)
		{
			System.out.print(" ");
		}
		for(int a=1;a<=c;a++)
		{
			System.out.print("*");
		}
		for(int d=1;d<c;d++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
