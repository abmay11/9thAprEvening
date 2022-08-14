package polymorphism;

public class May23MethodOverloading {

	//compile time polymorphism
	public static void main(String[] args) 
	{
		May23MethodOverloading mo=new May23MethodOverloading();
		
		mo.test();
		mo.test(2);
		mo.test(5d);
		mo.test(4, 9); //static method non static way call
		test(48,5);  //static method static way call using above same definition
		test(65, 4, 3);
	}

	public void test()  //same method name with different parameter can be used
	{
		int x=10,y=20;
		int add=x+y;
		
		System.out.println("sum is "+add);
	}
	
	public void test(int x)
	{
	    int add=x+35;
		
		System.out.println("sum is "+add);
		
	}
	
	public void test(double x)
	{
		x=10;
	    double add=x+35; //x=5
		
		System.out.println("sum is "+add);
		
	}
	
	public static void test(int x,int y) 
	{
		
		int add=x+y; 
		
		System.out.println("sum is "+add);
	}
	
	public static void test(int x,int y,int z) 
	{
		
		int add=x+y+z; 
		
		System.out.println("sum is "+add);
	}
	
	
	
	
}
