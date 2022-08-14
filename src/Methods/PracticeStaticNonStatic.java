package Methods;

public class PracticeStaticNonStatic {
	
	public static void test() {
		String msg;
		msg="this is static regular method from same class";
		System.out.println(msg);
		
	}

	public static void main(String[] args) {
		
		test();//static regular from same class
		
		PracticeStaticNonStatic A= new PracticeStaticNonStatic();//object created for same class
		A.practice();//non static regular from same class
		
		PracticeStaticNonStatic1.test1();//static regular from different class
		
		PracticeStaticNonStatic1 B= new PracticeStaticNonStatic1();//object created for different class
		B.practice1();//Non static regular from different class
		
		

	}
	
	public void practice() {
		
		int rollnum;
		rollnum=10;
		System.out.println(rollnum);
	}

}
