package programs.patternPrograms;

public class Two_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==6)
			{
				for(int star=1;star<=6;star++)
				{
					System.out.print("* ");
				}
			}
			else if(row<=5)
			{
				for(int space=1;space<=6;space++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			else if(row<=8)
			{
				System.out.print("*");
			}
			else {
				for(int star=1;star<=7;star++)
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
