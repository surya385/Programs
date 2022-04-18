package programs.patternPrograms;

public class Q_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=8;row++)
		{
			if(row==1||row==6)
			{
				System.out.print("  ");
				for(int star=1;star<=4;star++)
				{
					System.out.print("* ");
				}
			}
			else if(row>6)
			{
				for(int space=1;space<=row-2;space++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			else
			{
				System.out.print("* ");
				for(int col=1;col<=4;col++)
				{
					
					System.out.print("  ");
						
				}
				System.out.print("*");
				}
			System.out.println();	
		}
			
		}
		
	}


