package programs.patternPrograms;

public class J_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=10;row++)
		{
			if(row==1)
			{
				for(int star=1;star<=9;star++)
				{
					System.out.print("* ");
				}
			}
			else if(row==10)
			{
				for(int star=1;star<=4;star++)
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
