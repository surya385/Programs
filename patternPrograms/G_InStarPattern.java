package programs.patternPrograms;

public class G_InStarPattern {

	public static void main(String[] args) {
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==9)
			{
				System.out.print("  ");
				for(int star=1;star<=6;star++)
				{
					System.out.print("* ");
				}
			}
			else if(row>=7&&row<=8)
			{
				System.out.print("* ");
				for(int space=1;space<=5;space++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			else if(row==6)
			{
				System.out.print("* ");
				for(int space=1;space<=3;space++)
				{
					System.out.print("  ");
				}
				for(int star=1;star<=3;star++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
