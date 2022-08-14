package Assignments;

public class May3UniversityStudent {

	public static void main(String[] args) {
		
		May3UniversityStudent us=new May3UniversityStudent();//object creation for same class
		us.studentInfo();//calling non static w/t parameter
		us.studentInfo("Megha", 22, 'F', 46.2359f, 5.236, 12);//calling non static with parameter 
		us.studentInfo("Mangesh", 22, 'M', 65.235f, 4.265, 4);
		//we can give same method name bcoz of w/t and with parameter
		
		studentMarks();//static method w/t parameter
		studentMarks(94, 69, 98);
		studentMarks(85,84,94);//static method with parameter
		//we can give same method name bcoz of w/t and with parameter
	}
	
	public void studentInfo() 
	{
		String name="Ram";
		int age=26; 
		char gender='M';
		float weight=69.367f;
		double height=6.32568974d;
		byte rollnum=10;
		
		System.out.println("My name is "+name);
		System.out.println("my age is "+age);
		System.out.println("My gender is "+gender);
		System.out.println("My weight is "+weight);
		System.out.println("My height is "+height);
		System.out.println("My roll number is "+rollnum);
		System.out.println("======================================");
	}
	
	public void studentInfo(String name,int age,char gender,float weight,double height,int rollnum) 
	{
		System.out.println("My name is "+name);
		System.out.println("my age is "+age);
		System.out.println("My gender is "+gender);
		System.out.println("My weight is "+weight);
		System.out.println("My height is "+height);
		System.out.println("My roll number is "+rollnum);
		System.out.println("======================================");
}
	public static void studentMarks() 
	{
	String sub1="Physics";
	String sub2="chemistry";
	String sub3="Maths";
	
	System.out.println("Marks in "+sub1+" is 69 out of 100");
	System.out.println("Marks in "+sub2+" is 82 out of 100");
	System.out.println("Marks in "+sub3+" is 78 out of 100");
	System.out.println("===========================================");
	
	}
	
	public static void studentMarks(int mark1,int mark2,int mark3) {
		
		System.out.println("Marks in science "+mark1+" out of 100");
		System.out.println("Marks in history "+mark2+" out of 100");
		System.out.println("Marks in sanskrit "+mark3+" out of 100");
		System.out.println("===========================================");
		
	}
}