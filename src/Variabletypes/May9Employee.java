package Variabletypes;

public class May9Employee {
//global variable declaration
	//global variable can call from one class to other class not possible for local variable
	//non static global variable can be call multiple times in main method
	//static variable can be call once..it is single use replica..it always stays with class so called as class variable also 
	//from name to gender non static variable
	String emp_name;
	String emp_id;
	float emp_sal;
	String emp_desgn;
	int emp_age;
	char emp_gender;
	static String team;//static global variable only use once
	
	public void emp_info() {
		
		System.out.println("======================");
		System.out.println("team name is "+team);
		System.out.println("employee name is "+emp_name);
		System.out.println("employee id is "+emp_id);
		System.out.println("employee salary is "+emp_sal);
		System.out.println("employee designation is "+emp_desgn);
		System.out.println("employee age is "+emp_age);
		System.out.println("employee gender is "+emp_gender);
		System.out.println("======================");
	}
}
