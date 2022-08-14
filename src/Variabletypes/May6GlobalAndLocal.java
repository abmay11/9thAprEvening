package Variabletypes;

public class May6GlobalAndLocal {
	//non static global variable
	int a=90; //1+2-->declaration+ assign value
	
	//static global variable
	static int b=10; //1+2-->declaration+ assign value

	public static void main(String[] args) 
	{
		test1(); //calling static method from same class
		
		May6GlobalAndLocal g=new May6GlobalAndLocal(); //object created for same class
		g.test(); //calling non static method from same class
		
		System.out.println("global value of a is "+g.a); //calling non static global variable from same class
		System.out.println("global value of b is "+b); //calling static global variable from same class
		
		int sum=10+g.a; //usage of non static global variable
		System.out.println("sum of non static global is "+sum);
		int add=40+b; //cant use same variable name sum in same method
		System.out.println("sum of static global variable is "+add);
		
		//different class
		May6Sample s=new May6Sample(); //object created for different class 
		System.out.println("global value of p is "+s.p); //calling non static global variable from another class
		System.out.println("global value of q is "+May6Sample.q); //calling static global variable from another class 
		
		
		}
	
	public void test() 
	{
		int a=80;//local variable..range within method scope
		int sum=a+100; //a=80..it will take latest value
		System.out.println("Sum is "+sum);
	}
	
	public static void test1()
	{
		//static int b=1000;static variable with same name can be use only once..already use in global variable
		int a=2000; //non static variable with same name can be use multiple times
		int b=50; //non static variable..we can use same as static global variable
	
		System.out.println("this is static method test1 from same class");
    
	}
	

}
