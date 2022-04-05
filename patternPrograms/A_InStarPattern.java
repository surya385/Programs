package programs.patternPrograms;

public class A_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=10;row++)
		{
		
			if(row==6)
			{
				for(int space=1;space<=5;space++)
				{
					System.out.print(" ");
				}
				for(int star=1;star<=12;star++)
				{
					System.out.print("*");
				}
			}
			else {
			for(int col=row;col<=10;col++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int col=1;col<row;col++)
			{
				System.out.print("  ");
			}
			System.out.print("*");
		}
			System.out.println();
		}
	}

}
