package abstractClass;

public class May19VA extends May19AB //2
{ 
	//double click on VA..And from option to add unimplemented methods in superclass
	//VA called as concrete class
	//AB called as abstract class
	//static method can not set abstract

	public static void main(String[] args) 
	{
		May19VA m=new May19VA(); //1 created object of concrete class
		
		m.test(); //complete method from superclass
		m.test1(); //complete method from superclass...no definition 
		May19VA.alpha(); //complete static method from superclass..using other class
		May19AB.alpha(); //complete static method from superclass..using own class
		
		m.test3(); //incomplete method from superclass
		m.test4();  //incomplete method from superclass
		m.test5();  //incomplete method from superclass
	
		
		m.treat(); //own class method
		
		
	}

	//below override methods automatically comes after selected class as unimplemented
	
	@Override
	public void test3() 
	{
		System.out.println("Test3 method completed in VA");
		
	}

	@Override
	public void test4() 
	{
		System.out.println("Test4 method completed in VA");
		
	}

	@Override
	public void test5() 
	{
		System.out.println("Test5 method completed in VA");
		
	}
	
	public void treat() //own class method
	{
		System.out.println("treat method from same class");
	}

	


}
