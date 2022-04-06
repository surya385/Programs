package programs.patternPrograms;

public class L_InStarPattern {

	public static void main(String[] args) {
		for(int row=1;row<=10;row++)
		{
		
			if(row==10)
			{
				for(int col=1;col<=6;col++)
				{
					System.out.print("* ");
				}
			}
			else {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
