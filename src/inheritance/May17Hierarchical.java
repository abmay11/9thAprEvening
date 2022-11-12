package inheritance;

public class May17Hierarchical {

	//Acquiring properties from parent class A by sub class B and C 
	
	public static void main(String[] args) 
	{
		May17A a=new May17A();//object created for A class
		a.test(); //calling A class method using A's object
		System.out.println("===========");
		
		May17B b=new May17B(); //object created for B class
		b.test1(); //calling B class method using B's object
		b.test();  //calling A class method using B's object
		System.out.println("===========");
		
		May17C c=new May17C(); //object created for C class
		c.test2();  //calling C class method using C's object
		c.test();  //calling A class method using C's object
		System.out.println("==========");
		
		

	}

}
