package programs.patternPrograms;

public class S_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==5||row==9)
			{
				System.out.print("  ");
				for(int col=1;col<=5;col++)
				{
					System.out.print("* ");
				}
			}
			else if(row>=6&&row<=8) {
				for(int col=1;col<=6;col++)
				{
					System.out.print("  ");
				}
				System.out.println("*");
			}
			else
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
