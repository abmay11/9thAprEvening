package AccessSpecifiers;

public class May17Demo {

	public static void main(String[] args) 
	{
		May17use m=new May17use(); //object created
		
	 m.test();//in shortcut notation is green circle//public can be accessed within project
	 //d.test1(); //can't access private outside of its class
	 m.test3();//in shortcut notation is blue triangle// default can be accessed within package
	 May17use.test4();//in shortcut notation is yellow diamond// protected can be accessed within package and outside of package by inheritance

	 System.out.println("====================");
	 
	    System.out.println("value of a is "+m.a);  //default
		//System.out.println("value of b is "+m.b);  //private cant access
		System.out.println("value of c is "+m.c);   //public
		System.out.println("value of d is "+May17use.d);    //protected
	
	}

}
