package generalisation;

public class May30Banking {

	public static void main(String[] args) 
	{
		May30SBI s=new May30SBI();
		May30AXIS a=new May30AXIS();
		May30BOI b=new May30BOI();
		
		s.deposit();
		s.loan();
		s.facility();
		s.YONO();
		System.out.println("=============================");
		
		a.deposit();
		a.loan();
		a.facility();
		May30AXIS.AxisApp(); //static method
		System.out.println("=============================");
		
		b.deposit();
		b.loan();
		b.facility();
		May30BOI.BOIstarApp(); //static method
		System.out.println("============================");

	}

}
