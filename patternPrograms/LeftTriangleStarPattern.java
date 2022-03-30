package programs.patternPrograms;

public class LeftTriangleStarPattern {

	public static void main(String[] args) {
		

		for(int c=1;c<=10;c++) 
		{
		for(int a=9;a>=c;a--)
		{
			System.out.print(" ");
		}
		for(int b=1;b<=c;b++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
