package casting;

public class June1UpCasting {

	public static void main(String[] args) 
	{
		June1Father f=new June1Father();
		June1Son s=new June1Son();
		
		f.car();
		f.bike();
		System.out.println("=====================");
		
		s.car();
		s.bike();
		s.Sport(); //son object require to call its method..which is present only in son class
		System.out.println("=====================");
		
		June1Father f1=new June1Son();  //here f1 object belongs to son class..father is a data type
		
		f1.car(); //method common in father and son class will only get acquired by f1 object.
		f1.bike(); //call will go to son class 
		// f1.sport(); 
		
		
	}

}
