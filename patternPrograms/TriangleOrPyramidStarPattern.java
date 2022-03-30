package programs.patternPrograms;

public class TriangleOrPyramidStarPattern {

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
		for(int d=2;d<=c;d++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}

}
