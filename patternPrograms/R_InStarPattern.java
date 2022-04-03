package programs.patternPrograms;

public class R_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=10;row++)
		{
			if(row==1||row==5)
			{
				for(int col=1;col<=6;col++)
				{
					System.out.print("* ");
				}
			}
			else if(row>=2&&row<=4)
			{
				System.out.print("* ");
				for(int col=1;col<=5;col++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			else
			{
				System.out.print("* ");
				for(int col=6;col<row;col++)
					
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
