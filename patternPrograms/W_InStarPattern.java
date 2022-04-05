package programs.patternPrograms;

public class W_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=10;row++)
		{
			System.out.print("*");
			for(int col=row;col<10;col++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int col=1;col<row;col++)
			{
				System.out.print("  ");
			}
			System.out.print("*");
			for(int col=row;col<10;col++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
