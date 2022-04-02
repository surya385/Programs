package programs.patternPrograms;

public class Eight_InStarPattern {

	public static void main(String[] args) 
	{
	for(int row=1;row<=9;row++)
	{
		if(row==1||row==5||row==9)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print("* ");
			}
		}
		else {
			for(int col=1;col<=5;col++)
			{
				if(col==1||col==5)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
		}
		
	System.out.println();
	}
		
	}

}
