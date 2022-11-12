package inheritance;

public class May16MultiLevelInheritance {

	public static void main(String[] args) 
	{
		May16Daughter d=new May16Daughter(); //object created for class May16Daughter
		May16Mother m=new May16Mother(); //object created for class May16Mother
		
		//static method calling
		May16Daughter.mobile();//calling May16Daughter method using May16Daughter class 
		May16Daughter.nature();//calling May16Mother method using May16Daughter class 
		May16Daughter.receipe();//calling May16Grandmother method using May16Daughter class 
		
		System.out.println("=====================");
		
		May16Mother.nature();//calling May16Mother method using May16Mother class
		May16Mother.receipe();//calling May16Grandmother method using May16Mother class
		
		System.out.println("======================");
		
		//non static method calling
		d.laptop();//calling May16Daughter method using May16Daughter class object
		d.looks();//calling May16Mother method using May16Daughter class object
		d.stories();//calling May16Grandmother method using May16Daughter class object
		
		System.out.println("=====================");
		
		m.looks(); //calling May16Mother method using May16Mother class object
		m.stories(); //calling May16Grandmother method using May16Mother class object

	}

}
