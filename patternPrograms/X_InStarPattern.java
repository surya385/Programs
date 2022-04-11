package programs.patternPrograms;

public class X_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=11;row++)
		{
			if(row<=5) {
			for(int space=1;space<row;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int space=row;space<=5;space++)
			{
				System.out.print(" ");
			}
			for(int space=row;space<=4;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			}
			else if(row==6)
			{
				for(int space=1;space<row;space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
			}
			else
			{
				for(int space=row;space<=10;space++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				for(int space=7;space<=row;space++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
				
			}
			System.out.println();
		}
	}

}
