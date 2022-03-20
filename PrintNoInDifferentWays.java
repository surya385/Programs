package numberPrograms;

public class PrintNoInDifferentWays {

	public static void main(String[] args) {
    PrintNoInDifferentWays obj=new PrintNoInDifferentWays();
    int a=123456;
    obj.format1(a);
    obj.format2(a);
    obj.format3(a);
    obj.format4(a);
	}

	
	private void format4(int a) {
		System.out.println("format 3:");
		while(a>0) {
			System.out.println(a%10);
			a/=100;
		}
	}

	private void format3(int a) {
		System.out.println("format 3:");
		while(a>100)
		{
			System.out.println(a%1000);
			a/=10;
		}
	}

	private void format2(int a) {
		System.out.println("format 2:");
		while(a>1)
		{
			
			System.out.println(a%100);
			a/=10;
		}
	}

	private void format1(int a) {
		System.out.println("format 1:");
		while(a>0) {
			
			System.out.println(a%10);
			a/=10;
		}
	}

}
