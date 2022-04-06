package programs.patternPrograms;

public class K_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=9;row++)
		{
			System.out.print("*");
			if(row>=1&&row<=4)
			{
			for(int col=row;col<=4;col++)
			{
				System.out.print("  ");
			}
			System.out.print("*");
			}
			else if(row>5)
			{
				for(int col=6;col<=row;col++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			else {
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
