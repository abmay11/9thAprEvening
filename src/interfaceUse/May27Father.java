package interfaceUse;

public interface May27Father 
{
	int a=20;   //static & final

	void money(); //public & abstract
	
	void rules(); //public & abstract
	
	void demo();
	
	default void love() //change to default & provided body..available from jdk version 8
	                    //public will not accept
	{
		System.out.println("Fathers love");
	}
	
	static void random()    //by default public
	{
		System.out.println("fathers random test");
	}
	
	
}
