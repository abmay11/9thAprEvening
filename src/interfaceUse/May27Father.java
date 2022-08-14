package interfaceUse;

public interface May27Father 
{

	void money(); //public & abstract
	
	void rules(); //public & abstract
	
	default void love() //change to default & provided body..available from jdk version 8
	                    //public will not accept
	{
		System.out.println("Fathers love");
	}
	
	static void random()
	{
		System.out.println("fathers random test");
	}
	
	
}
