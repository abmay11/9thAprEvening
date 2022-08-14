package constructor;

public class May4MathOperation {
	
	int a;//1.variable declaration
	int b;
	

	public May4MathOperation() 
	{
		a=60;
		b=40;
		System.out.println("this is user defined constructor");
		
	}
	
	
	public static void main(String[] args) 
	{
		May4MathOperation mo= new May4MathOperation();//object created for same class
		mo.add();//calling 
	}

	public void add() 
	{
	   //2.assign value(initilisation)
	   a=10;b=25;//if we initilise value in non static as well as constructor it will take nearby values
	   int sum=a+b;
	   System.out.println("sum is "+sum);
	}
}
