package programs.patternPrograms;

public class NoPattern {

	public static void main(String[] args) {

		int no1=1,no2=0;
		for(int row=1;row<=5;row++)
		{
			for(int space=row;space<=4;space++)
			{
				System.out.print("  ");
			}
			int temp1=no1;
			for(int i=1;i<=row;i++)
			{
				System.out.print(temp1+" ");
				temp1++;
			}
			int temp2=no2;
			for(int j=2;j<=row;j++)
			{
				System.out.print(temp2+" ");
				temp2--;
			}
			no1++;
			no2+=2;
			System.out.println();
		}
	}

}
