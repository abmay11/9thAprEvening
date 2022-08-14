package polymorphism;

public class May24OverRiding1 extends  May24OverRiding {

	public static void main(String[] args) 
	{
		 May24OverRiding mo=new  May24OverRiding();//object created for superclass
		 May24OverRiding1 mo1=new  May24OverRiding1();// object created for same class
		 
		 mo.demo(); //calling superclass method
		 mo1.demo(); //calling same class method
		 
		 //in this if we alter object name keeping method name same then only o/p will change.. no need to change method
		 //mo1.demo();
		 //mo.demo(); //method name same only altered object
		

	}
	
	public void demo() //same method name with diff definitions from superclass
	{
		System.out.println("This is subclass non static method");
	}


}
