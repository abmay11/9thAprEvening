package Methods;

public class Apr28Static3 {
	
public static void test()  {
		
	//Static Regular complete method
		System.out.println("Static Regular method name as test() from same class Above the main method");
		
}

	public static void main(String[] args) {
		System.out.println("this is main method msg");//main method
		
		test();//from same class
		
		Apr28Static1.test1();//from different class

	}

}
