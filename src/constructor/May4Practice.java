package constructor;

public class May4Practice {
	//global variable
	int x,y;
	char gender,divison;
	String name;
	
	public  May4Practice() //user defined constructor
	{
		x=10;y=26;
		name="Abhay";
		name="Radha";//if we declare same variable it will take latest one
		gender='F';divison='A';
	}
	public static void main(String[] args) {
		
		May4Practice prac=new May4Practice();// object created
		prac.test1();//calling non static method 1
		prac.test2();//calling non static method 1
		

	}

	public void test1() //non static 1
	{
		System.out.println("My name is "+name);
		System.out.println("My divison is "+x+" "+divison);
		System.out.println("====================================");
   }
	
	public void test2() //non static 2
	{
		System.out.println("My name is "+name);
		System.out.println("My age is "+y);
		System.out.println("My gender is "+gender);
	}
	
}
