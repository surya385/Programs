//
package programs;

public class NumberSeries {

	public static void main(String[] args) {
		NumberPrograms obj=new NumberPrograms();
		obj.program1();
		System.out.println();
		obj.program2();
	}
 
	private void program1() {
		//print the following series : 1 2 4 7 11 16 22
		int no1=1;
		for(int no2=1;no2<=6;no2++)
		{
			System.out.print(no1 +" ");
			no1+=no2;
		}
				
	}

	private void program2() {
		//print the following series : 1 2 6 12 20 30 
		int no1=1;
		for(int no2=1;no2<=6;no2++)
		{
			System.out.print(no1*no2 +" ");
			no1=no2;
		}
	}

}
