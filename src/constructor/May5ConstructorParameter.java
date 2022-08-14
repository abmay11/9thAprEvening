package constructor;

public class May5ConstructorParameter {

	int a,b,c,add;//1.global variables-->inside of class but outside of all methods
	
	public May5ConstructorParameter()//3.constructor w/t parameter
	{
		a=10;
		b=20;
		c=20;
	}
	public May5ConstructorParameter(int x)//5.constructor with 1 parameter 
	{                                     //we can't use same variable in constructor declaration i.e.a=a;
		a=x;
	//	b=0;
    //  c=0;
	}
	
	public May5ConstructorParameter(int x,int y)//7.constructor with 2 parameter
	{
		a=x;
		b=y;
	//  c=0;
	}
	
	public May5ConstructorParameter(int x,int y,int z)//9.constructor with 3 parameter
	{
		a=x;b=y;c=z;
	}
	
	
	public static void main(String[] args) {
		// same class non static method
		May5ConstructorParameter cp=new May5ConstructorParameter();//4.constructor w/t parameter
		cp.add();
		
		May5ConstructorParameter cp1=new May5ConstructorParameter(5);//6.constructor with 1 parameter
		cp1.add();
		
		May5ConstructorParameter cp2=new May5ConstructorParameter(5,5);//8.constructor with 2 parameter
		cp2.add();
		
		May5ConstructorParameter cp3=new May5ConstructorParameter(5,10,15);//10.constructor with 3 parameter
		cp3.add();

		//different class non static method
		//declare variable in different class only
		//create constructor of different class in that class only
		
		May5ConstructorParameter1 cp4=new May5ConstructorParameter1(6);
		cp4.sub();//15.calling constructor with single parameter
	    May5ConstructorParameter1 cp5=new May5ConstructorParameter1(12,4);//16.constructor with 2 parameter
	    cp5.sub();
	}
	
	public void add() //2
	{
		add=a+b+c;
		System.out.println("Addition is "+add);
	}
}
