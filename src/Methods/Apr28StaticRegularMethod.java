package Methods;

public class Apr28StaticRegularMethod {

	public static void main(String[] args) {
		
		System.out.println("this is main method msg"); //Main method 
		
        test();//static regular method from same class Apr28StaticRegularMethod
               //directly call the methodname()
        
        Apr28Static1.test1(); //static regular method from different class Static1
                         //we cant directly call the name classname.methodname()
        
        
       }
	
	public static void test() //Static Regular complete method below main method()
	{
		
		System.out.println("Static Regular method name as test() from same class");
	}

}
