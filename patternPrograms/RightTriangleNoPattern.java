package programs.patternPrograms;

public class RightTriangleNoPattern {

	public static void main(String[] args) {
		
		RightTriangleNoPattern obj=new RightTriangleNoPattern();
		
		obj.pattern1();
		System.out.println();
		obj.pattern2();
		System.out.println();
		obj.pattern3();
	}

	private void pattern3() {
		
		int value=1;
		for(int row=1;row<=5;row++)
		{
		for(int col=row;col<=value;col++)
		{
			System.out.print(col+ " ");
			
		}
		System.out.println();
		value+=2;
		}
	}

	private void pattern2() {
		
		for(int row=1;row<=5;row++)
		{
		for(int col=1;col<=row;col++)
		{
			System.out.print(col+ " ");
		}
		System.out.println();
		}
	}

	private void pattern1() {
		
		for(int row=1;row<=5;row++)
		{
			for(int column=1;column<=row;column++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
	}

}
