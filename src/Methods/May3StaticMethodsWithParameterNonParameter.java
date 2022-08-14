package Methods;

public class May3StaticMethodsWithParameterNonParameter {

	public static void main(String[] args) {
		
	test();//calling static w/t parameter same class
	test1(35, 15);//calling static with parameter same class

	May3StaticMethodsWithParameterNonParameter m=new May3StaticMethodsWithParameterNonParameter(); //object m created for same class
	m.check();//calling non static w/t parameter same class
	m. check1(5, 18, 10);//calling non static with parameter same class
	
	May3StaticMethodsWithParameterNonParameter1.test2();//calling static regular method W/T parameter from different class
	May3StaticMethodsWithParameterNonParameter1.test3("abhimay11@gmail.com");//calling static regular method With parameter from different class
	//to call alphabate+number+special character type use string
	
	May3StaticMethodsWithParameterNonParameter1 n=new May3StaticMethodsWithParameterNonParameter1(); //object n created for different class
	n.check1();//calling non static w/t parameter from different class
	n.check2('P');//calling non static with parameter from different class
	
	}
	
	public static void test() //static regular method w/t parameter
	{
		int a=10;
		int b=5;
		int sub=a-b;
		
		System.out.println("Static w/t parameter subtraction is "+sub);
		
	}
	
	public static void test1(int x,int y) //static regular method with parameter
	{

		int sub=x-y;
		System.out.println("Static with parameter subtraction is "+sub);

    }
	
	public void check() //non static regular method w/t parameter
	{
		
		int p=4,q=6,r=8;
		int sum=p+q+r;
		
		
		System.out.println("Non static w/t parameter addion is "+sum);
	
	}
	
	public void check1(int p,int q,int r)//non static regular method with parameter
	{
		int sum=p+q+r;
		System.out.println("Non static with parameter addition is "+sum);
		
	}
}