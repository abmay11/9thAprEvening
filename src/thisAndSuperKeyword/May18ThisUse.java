package thisAndSuperKeyword;

public class May18ThisUse
{
	int a=100; //non static global variable
	static int b=56; //static global variable

	public static void main(String[] args) 
	{
		May18ThisUse t=new May18ThisUse();
		t.test();
		System.out.println("Global value of a is by normal way "+t.a);
		System.out.println("Global value of b is by normal way "+b);
	}
	
	public void test() 
	{
		int a=80;//local variable..range within method scope
		int sum=a+100;//a value is local value//see color also violet
		System.out.println("Sum is "+sum);
		
		int sum1=this.a+100;//a value is global//see color also blue
		System.out.println("Sum is "+sum1);
		
		System.out.println("Local value of a is "+a);
		System.out.println("Global value of a is "+this.a); //this is keyword to call global non static variable 
	
		int b=40; //local variable
		
		System.out.println("Local value of b is "+b);
		System.out.println("Global value of b is "+this.b); //this is keyword to call global static variable 
	
	}

}
