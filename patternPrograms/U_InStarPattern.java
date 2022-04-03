package programs.patternPrograms;

public class U_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=9;row++)
		{
			if(row==9)
			{
				System.out.print("  ");
				for(int col=1;col<=5;col++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("* ");
				for(int col=1;col<=5;col++)
				{
					System.out.print("  ");
					
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
