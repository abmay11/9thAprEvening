package interfaceUse;

public class May30Student implements May30Scholar //1
{
	//it is like multiple inheritance..but different way of using extend and implementation
	//static method can't override

	public static void main(String[] args) 
	{
		May30Student s=new May30Student();
		
		s.case1(); //masters method
		s.case2();
		s.case3(); //scholar method
		s.case4();
		s.case5(); //own class method
		
		May30Student.case6(); //own staic method
		

	}

	@Override
	public void case1() {
		
		System.out.println("Masters method Case1 completed in student");
	}

	@Override
	public void case2() {
		System.out.println("Masters method Case2 completed in student");
		
	}

	@Override
	public void case3() {
		System.out.println("Scholar method Case3 completed in student");
		
	}

	@Override
	public void case4() {
	
		System.out.println("Scholar method Case4 completed in student");
	}
	
	public void case5()
	{
		System.out.println("Case5 student own method");
	}
	
	public static void case6()
	{
		System.out.println("Case6 student own static method ");
	}

}
