package ControlStatement;

public class May10SwitchCase {

	// difference between switch case and else if is that..
	//else if will check all statements but in switch case it will directly jumped to required statement
	
	public static void main(String[] args) {
		/*if today is Monday --> this is 1st day of week
		 *
		 * 
		 * 
		 * sunday--> this is 7th day of week
	     */
		
		String day="Thursday";
		
		
		switch (day) 
		{
		case "Monday":System.out.println("it is 1st day of week");
	    break;
	    
		case "Tuesday":System.out.println("it is 2nd day of week");
		break;
		
		case "Wednesday":System.out.println("it is 3rd day of week");
        break;
		
		case "Thursday":System.out.println("it is 4th day of week");
        break;
        
		case "Friday":System.out.println("it is 5th day of week");
        break;
		
		case "Saturday":System.out.println("it is 6th day of week");
        break;
        
		case "Sunday":System.out.println("it is 7th day of week");
        break;
        
		default:System.out.println("Enter valid day");
	    break;
		}
		
		//eg.2
		//grade A--> >90
        //B--> >=66-<90
        //C
        //D
		char grade='D';
		
		switch (grade) 
		{
		case 'A':System.out.println("marks>=90");
		break;
		
		case 'B':System.out.println("marks>=66 & marks<90");
        break;
        
		case 'C':System.out.println("marks>=50 & marks<66");
		break;
		
		case 'D':System.out.println("marks>=40 & marks<50");
        break;
        
		default:System.out.println("i am fail"); //
	    break;
		}
		
	}

}
