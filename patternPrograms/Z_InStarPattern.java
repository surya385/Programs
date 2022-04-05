package programs.patternPrograms;

public class Z_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=10;row++)
		{
			if(row==1||row==10)
			{
				for(int col=1;col<=10;col++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int col=row;col<=9;col++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
