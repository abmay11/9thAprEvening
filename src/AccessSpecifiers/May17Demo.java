package AccessSpecifiers;

public class May17Demo {

	public static void main(String[] args) 
	{
		May17use d=new May17use(); //object created
		
	 d.test();//in shortcut notation is green circle//public can be accessed within project
	 //u.test1(); //can't access private outside of its class
	 d.test3();//in shortcut notation is blue triangle// default can be accessed within package
	 d.test4();//in shortcut notation is yellow diamond// protected can be accessed within package and outside of package by inheritance

	
	}

}
