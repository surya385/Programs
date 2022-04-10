package programs.patternPrograms;

public class P_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=11;row++)
		{
			if(row==1||row==5)
			{
				for(int star=1;star<=6;star++)
				{
					System.out.print("* ");
				}
			}
			else if(row<=4)
			{
				System.out.print("* ");
				for(int space=1;space<=5;space++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			else
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
