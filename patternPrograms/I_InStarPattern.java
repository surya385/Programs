package programs.patternPrograms;

public class I_InStarPattern {

	public static void main(String[] args) {
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==9)
			{
				for(int star=1;star<=9;star++)
				{
					System.out.print("* ");
				}
			}
			else {
				for(int space=1;space<=4;space++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
