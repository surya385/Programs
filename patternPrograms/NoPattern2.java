package programs.patternPrograms;

public class NoPattern2 {

	public static void main(String[] args) {
		
		int no=5;
		for(int a=0;a<5;a++)
		{
			for(int b=0;b<=a;b++)
			{
				System.out.print(no--);
			}
			System.out.println();
			no+=a;
		}
	}

}
