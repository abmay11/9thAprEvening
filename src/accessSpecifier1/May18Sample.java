package accessSpecifier1;

import AccessSpecifiers.May17use; //when we write May17use it comes in shortcut automatically//importing data from another package

public class May18Sample extends May17use //use inheritance to call protected//3
{

	public static void main(String[] args) 
	{
		May17use u=new May17use();//created object of class may17use//no need of inheritance but not possible w/t import
		
		u.test();//public can be accessed within project//calling from class may17use from accessSpecifier class//imported
		         //we can call only public anywhere
	    May17use.test4();   //calling in static way
	    System.out.println("======================");
	    
		//to call protected method we need to create object of subclass//standard procedure
		May18Sample s=new May18Sample();//created object of same class i.e.subclass
		
		s.test(); //calling superclass public method using subclass object //public from may17use class
		s.test4(); //calling superclass protected method using subclass object//possible due to inheritance
		System.out.println("======================");
		
		May18Sample.test4();  //calling in static way
		//default and private can not be called
	

	}

}
