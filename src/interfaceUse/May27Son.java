package interfaceUse;

public class May27Son implements May27Mother,May27Father 
{
	//multiple inheritance solution,diamond ambiguity solved by interface

	public static void main(String[] args) 
	{
		May27Son s=new May27Son();
		
		s.looks(); //mother interface
		s.nature(); //mother interface
		s.rules(); //father interface
		s.money(); //father interface
		s.ethics(); //own class
		
		s.love(); //calling default method from both interfaces
		
		May27Mother.random(); //calling static method from Mother interface
		May27Father.random(); ////calling static method from Father interface
	} 

	@Override
	public void looks() 
	{
		System.out.println("mother looks");
		
	}

	@Override
	public void nature() 
	{
		System.out.println("mothers nature");
		
	}

	@Override
	public void love() //diamond ambiguity..same method name with different definition in different interface class
	{
	  May27Mother.super.love(); //calling like global variable from another class
	  May27Father.super.love(); //calling like global variable from another class
		
	}

	@Override
	public void money() 
	{
		System.out.println("father's money");
		
	}

	@Override
	public void rules() 
	{
		System.out.println("father rules");
		
	}
	
	public void ethics() //used public because we r in implementation class 
	{
		System.out.println("own class method");
	}
}
