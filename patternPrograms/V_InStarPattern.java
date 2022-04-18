package programs.patternPrograms;

public class V_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=8;row++)
		{
			for(int space=1;space<=row;space++)
			{
				System.out.print(" ");
			}
			System.out.print("*");
			for(int space=row;space<=7;space++)
			{
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
	}

}
