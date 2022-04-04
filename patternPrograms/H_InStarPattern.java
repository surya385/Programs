package programs.patternPrograms;

public class H_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=9;row++)
		{
			if(row==5)
			{
				for(int col=1;col<=7;col++)
				{
					System.out.print("* ");
					
				}
			}
			else {
				for(int col=1;col<=7;col++)
				{
					if(col==1||col==7)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			
			System.out.println();
		}
	}

}
