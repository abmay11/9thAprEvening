package inheritance;

public class May13Son extends May13Mother {

	int a =56; //global non static variable
	static int b=39; //global static variable
	
	//single level inheritance...son extending properties from mother class
	public void mobile()
	{
		System.out.println("Sons Mobile");
	}
	
	public static void laptop() 
	{
		System.out.println("Sons Laptop");
	}
	
//	public static void main(String[]args)
//	{
//	looks();  //we can directly call Super class static method w/t using class name or object
//	}
}
