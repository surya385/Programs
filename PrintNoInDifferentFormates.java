package numberPrograms;

public class PrintNoInDifferentFormates {

	public static void main(String[] args) {

		PrintNoInDifferentFormates obj=new PrintNoInDifferentFormates();
		obj.format1();
		obj.format2();
		obj.format3();
		
	}



	private void format3() {
		int a=0;
		System.out.println("format :3");
		while(a<=20)
		{
			a+=4;
			System.out.println(a);
			
		}		
	}

	private void format2() {
		int a=0;
		System.out.println("format :2");
		while(a<=20)
		{
			a+=3;
			System.out.println(a);
			
		}		
	}

	private void format1() {

		int a=1;
		System.out.println("format :1");
		while(a<=20)
		{
			a*=2;
			System.out.println(a);
			
		}
	}



	

}
