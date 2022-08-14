package constructor;
//constructor use for Non static method only
public class May4Test {

	/*public May4Test()
	 * {
	 * default constructor-->compiler will create automatically at the time of compilation
	 * }
	 */
	
	public May4Test() //2.constructor name always similar to class name
	//user defined constructor-->w/t parameter or zero parameter
	{
		//3.
		System.out.println("This is User Defined Constructor");
	}
	
	public static void main(String[] args) 
	{
		May4Test m=new May4Test();//1.created object of class

	}

}
