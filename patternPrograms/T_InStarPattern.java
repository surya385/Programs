package programs.patternPrograms;

public class T_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=9;row++)
		{
			if(row==1)
			{
				for(int col=1;col<=7;col++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				for(int col=1;col<=3;col++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
		 System.out.println();
		}
	}

}
