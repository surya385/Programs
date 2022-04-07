package programs.patternPrograms;

public class O_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==9)
			{
			System.out.print(" ");
			for(int star=1;star<=5;star++)
			{
				System.out.print("* ");
			}
			}
			else {
				System.out.print("*");
				for(int space=1;space<=9;space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
