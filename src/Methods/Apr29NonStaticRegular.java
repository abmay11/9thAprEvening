package Methods;

public class Apr29NonStaticRegular {

	public static void main(String[] args) {
		//creating object
		//classname objectname= new classname();
		Apr29NonStaticRegular A= new Apr29NonStaticRegular();
		
		//to call non static method from same class
		//objectname.methodname();
		A.test();

		//creating object of different class
		Apr29NonStaticRegular1 B= new Apr29NonStaticRegular1();
		
		//to call non static method from different class
		//objectname.methodname //same type as calling from same class
		B.test1();   
		
		Apr28StaticRegularMethod.test();//from another class Static regular method
	}
	
	public void test() {
		
		System.out.println("Non Static Regular Method From Same Class");
	}
	

}
