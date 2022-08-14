package constructor;

public class May5ConstructorParameter1 {
	int a,b,sub;//11
	
	public May5ConstructorParameter1(int y) //13.constructor with 1 parameter
	{
		
	      b=y;
	}
	public May5ConstructorParameter1(int x,int y) //14.constructor with 2 parameter
	{
		a=x;
		b=y;
	}
	public void sub() //12
	{
		sub=a-b;
		System.out.println("Subtraction is "+sub);
	}

}
