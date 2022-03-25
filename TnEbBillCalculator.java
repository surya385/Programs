
import java.util.Scanner;

public class TnEbBillCalculator {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		TnEbBillCalculator obj=new TnEbBillCalculator();
		System.out.println("Enter your Unit :");
		float b=a.nextFloat();
		obj.ebBillCalculator(b);
		a.close();
	}
	
	private void ebBillCalculator(float b)
	{
		if(b<=100)
		{
			System.out.println("your EB Bill is :0 ");
		}
		else if(b<=200)
		{
			float z=b-100;
			System.out.println("your EB Bill is :"+z*1.5);
		}
		else if(b<=500)
		{
			float z=b-200;
				
				System.out.println("your EB Bill is :"+((100*2)+(z*3)));
			}
		else
		{
			float z=b-500;
			System.out.println("your EB Bill is :"+((100*3.5)+(300*4.6)+(z*6.6)));
		}
	}

}
