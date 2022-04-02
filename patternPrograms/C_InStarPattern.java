package programs.patternPrograms;

public class C_InStarPattern {

	public static void main(String[] args) {
		
		for(int row=1;row<=7;row++)
		{
			if(row==1||row==7)
			{
				for(int col=1;col<=5;col++)
				{
					if(col==1)
					{
						System.out.print("  ");
					}
					
					  else if(col==2) 
					  	{
						  System.out.print(" * "); 
						}
					 
					else
					{
						System.out.print("* ");
					}
				}
			}
			
			  else if(row==2||row==6) 
			  {
				  System.out.print(" *"); 
			  }
			 
			else
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}

}
