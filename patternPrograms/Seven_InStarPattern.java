package programs.patternPrograms;

public class Seven_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=7;row++)
		{
			if(row==1)
			{
				for(int star=1;star<=6;star++)
				{
					System.out.print("* ");
				}
			}
			else {
				for(int space=row;space<=10;space++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
