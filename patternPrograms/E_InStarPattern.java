package programs.patternPrograms;

public class E_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==5||row==9)
			{
			for(int star=1;star<=5;star++)
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
