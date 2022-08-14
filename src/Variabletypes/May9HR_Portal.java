package Variabletypes;

public class May9HR_Portal 
{

	public static void main(String[] args) 
	{
		
		May9Employee Sachin=new May9Employee();//object created for another class
		May9Employee Virat=new May9Employee();//another object created
		//non static VARIABLE INITILISATION OF ANOTHER CLASS (objectname.variable)
		
		May9Employee.team="AUS";//static global variable only single replica..it will execute latest statment..eg INDIA not AUS
		May9Employee.team="INDIA";//static global variable initilise from another class
		Sachin.emp_name="Sachin";//non static global variable from another class
		Sachin.emp_id="IND10";
		Sachin.emp_sal=56.23f;
		Sachin.emp_desgn="Batsman";
		Sachin.emp_age=41;
		Sachin.emp_gender='M';
		
		Virat.emp_name="Virat";//non static global variable from another class
		Virat.emp_id="IND18";
		Virat.emp_sal=87.33f;
		Virat.emp_desgn="Batsman";
		Virat.emp_age=36;
		Virat.emp_gender='M';
		
		
		Sachin.emp_info();
		Virat.emp_info();
		
		

	}

}
