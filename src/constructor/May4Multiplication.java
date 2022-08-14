package constructor;

public class May4Multiplication {

	int a;//1.variable declare
	int b;
	int mul;
	
	public May4Multiplication() //5.constructor created
	{
		
		a=10;//variable initialize
		b=4;
		System.out.println("This is user defined constructor");
	}
	
	public static void main(String[] args) {
		//3.same class
		May4Multiplication mp=new May4Multiplication();//object creation
		mp.mul();//calling non static method
		
		//4.different class
		May4Multiplication1 s=new May4Multiplication1();//object created
		s.bool();//calling non static method from diffrent class

	}
//2.
	public void mul() {

		mul=a*b;
		System.out.println("Multiplication is "+mul);
		System.out.println("This is non static regular method");
	}
}
