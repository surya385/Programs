package programs.patternPrograms;

public class MyNameInStarPattern {

	public static void main(String[] args) {
		
		MyNameInStarPattern obj=new MyNameInStarPattern();
		obj.s();
		System.out.println();
		obj.u();
		System.out.println();
		obj.r();
		System.out.println();
		obj.y();
		System.out.println(); 
		obj.a();
		
	}

	private void s() {
			
		for(int row=1;row<=9;row++)
		{
			if(row==1||row==5||row==9)
			{
				System.out.print("  ");
				for(int col=1;col<=5;col++)
				{
					System.out.print("* ");
				}
			}
			else if(row>=6&&row<=8) {
				for(int col=1;col<=6;col++)
				{
					System.out.print("  ");
				}
				System.out.println("*");
			}
			else
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}

	private void u() {
		
		for(int row=1;row<=9;row++)
		{
			if(row==9)
			{
				System.out.print("  ");
				for(int col=1;col<=5;col++)
				{
					System.out.print("* ");
				}
			}
			else
			{
				System.out.print("* ");
				for(int col=1;col<=5;col++)
				{
					System.out.print("  ");
					
				}
				System.out.print("* ");
			}
			System.out.println();
		}
				
	}

	private void r() {
		for(int row=1;row<=10;row++)
		{
			if(row==1||row==5)
			{
				for(int col=1;col<=6;col++)
				{
					System.out.print("* ");
				}
			}
			else if(row>=2&&row<=4)
			{
				System.out.print("* ");
				for(int col=1;col<=5;col++)
				{
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			else
			{
				System.out.print("* ");
				for(int col=6;col<row;col++)
					
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			System.out.println();
		}
				
	}

	private void y() {
		for(int row=1;row<=9;row++)
		{
			if(row>=6)
			{
				for(int col=1;col<=3;col++)
				{
					System.out.print("  ");
				}
				System.out.print("*");
			}
			else {
			for(int col=1;col<row;col++)
			{
				System.out.print(" ");
			}
			System.out.print("* ");
			
			for(int col=5;col>=row;col--)
			{
				System.out.print(" ");
			}
			for(int col=4;col>=row;col--)
			{
				System.out.print(" ");
			}
			System.out.print("* ");
			}
			System.out.println();
		}
				
	}

	private void a() {
		
		for(int row=1;row<=7;row++)
		{
			if(row==4)
			{
				for(int col=1;col<=3;col++)
				{
					System.out.print(" ");
				}
				for(int col=1;col<=5;col++)
				{
					System.out.print("* ");
				}
			}
			else {
				for(int col=6;col>=row;col--)
				{
					System.out.print(" ");
				}
				System.out.print("* ");
				

				for(int col=1;col<row;col++)
				{
					System.out.print(" ");
				}
				for(int col=1;col<row;col++)
				{
					System.out.print(" ");
				}
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
				
	}

}
