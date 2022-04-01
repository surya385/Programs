package programs.patternPrograms;

public class NoPattern1 {

	public static void main(String[] args)
	{

		int no=9;
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=a;b++)
			{
			System.out.print(no--);
			}
			System.out.println();
		}
	}

}
