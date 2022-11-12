package interfaceUse;

public interface May27Mother 
{
	int a=10;     //static & final
    void looks(); //public & abstract
	
	void nature(); //public & abstract
	
	void demo();
	
	default void love() //change to default & provided body...available from jdk version 8
	{
		System.out.println("Mothers love");
	}
	
	static void random()   //by default public
	{
		System.out.println("mothers random test");
	}
	

	
	
}
