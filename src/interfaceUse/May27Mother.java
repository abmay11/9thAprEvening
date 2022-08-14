package interfaceUse;

public interface May27Mother 
{
    void looks(); //public & abstract
	
	void nature(); //public & abstract
	
	default void love() //change to default & provided body...available from jdk version 8
	{
		System.out.println("Mothers love");
	}
	
	static void random()
	{
		System.out.println("mothers random test");
	}
	

	
	
}
