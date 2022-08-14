package ControlStatement;

public class May11NestedIf {

	public static void main(String[] args) {
		
		String UN="fdfdgf";//UN-->username
		String password="ab@123";
		
		
		if(UN=="fdfdgf") //if condition satisfies then only will enter the scope..otherwise jumped to 2nd else stmnt
		{
			System.out.println("correct username,Plz enter Password");
			
			if(password=="ab@123") 
			{
			
				System.out.println("correct Password,Login succesfull");
			}
			else
			{
				System.out.println("invalid password,plz enter correct password");
			}
			
			
		}
		else
		{
			System.out.println("invalid username,enter valid username");
		}
		
		
		
		
		
	}

}
