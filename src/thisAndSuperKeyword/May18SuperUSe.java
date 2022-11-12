package thisAndSuperKeyword;

public class May18SuperUSe extends May18demo
{
 
	int a=10;// non static global variable
	static int b=50;// static global variable
	
	public May18SuperUSe() //constructor used for practice purpose
	{
		System.out.println("non static global value of a from sameclass "+this.a);//type 2
		System.out.println("non static global value of a from superclass "+super.a);
		
		
		System.out.println("static global value of b from sameclass "+this.b);//type 1
		System.out.println("static global value of b from sameclass "+b); //type1'
		//System.out.println("static global value of b from sameclass "+May18SuperUSe.b);
		
		System.out.println("static global value of b from superclass "+May18demo.b); //demo class
		System.out.println("static global value of b from superclass "+super.b);
		
	
		
		System.out.println("===============================================================");
	}
	
	public static void main(String[]args) //main method
	{
		May18SuperUSe s=new May18SuperUSe();
		s.test();
		
		System.out.println("non static global value of a from sameclass "+s.a); //type 2'...have to call in main method can't call in constructor
		System.out.println("static global value of b from sameclass using object "+s.b); //calling static global variable using object  
		
		
	}
	
	public void test() //non static method
	{
		int a=1;
		int sum=a+1;//local variable
		int sum1=this.a+1;//global variable from same class
		int sum2=super.a+1;//global variable from superclass demo//press ctrl and click on a it will show where from it came
		int sum3=super.b+1;//static global variable from superclass
		int sum4=May18demo.b+1;//static global variable from superclass
		int sum5=b+1;//static global variable from same class
		int sum6=this.b+1;//static global variable from same class
		
		System.out.println("using local value of a sum is "+sum);
		System.out.println("using global value of a from same class sum is "+sum1);
		System.out.println("using global value of a from superclass sum is "+sum2);
		System.out.println("using static global value of b from superclass sum is "+sum3);
		System.out.println("using static global value of b from same class sum is "+sum4);
		System.out.println("using static global value of b from same class sum is "+sum5);
		System.out.println("using static global value of b from same class sum is "+sum6);
		
	}
	
	
	
	
	
	
}
