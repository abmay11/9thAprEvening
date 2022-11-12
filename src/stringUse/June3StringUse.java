package stringUse;

public class June3StringUse {

	public static void main(String[] args) 
	{
		//6.contains() method use
		
		String d="Velocity";
		
		System.out.println(d.contains("v")); //case sensitive
		
		boolean test=d.contains("V"); //return type is true/false so used boolean datatype
		System.out.println(test); //to use in future
		
		System.out.println(d.contains("V"));
		System.out.println(d.contains("Vel")); //true ..in sequence
		System.out.println(d.contains("loc"));
		System.out.println(d.contains("Vlo")); //false..not in sequence
		System.out.println(d.contains("ty"));
		System.out.println("=====================");
		
		//7.Is empty() method use
		
		String r0="Pune";
		String r1="";
		String r2=" ";
		//String r3=null; //NullPointerException
		
		System.out.println(r0.isEmpty()); //length is not 0...false
		
		boolean result=r0.isEmpty(); //to use in future..return type is true or false so used data type as boolean
		System.out.println(result); 
		
		System.out.println(r1.isEmpty()); //length is 0..no space..true
		System.out.println(r2.isEmpty()); //space also consider length=1...i.e.not 0
		//System.out.println(r3.isEmpty()); //NullPointerException
		System.out.println("***************");
		
		//is blank() method use
		System.out.println(r0.isBlank()); //should not contain anything
		System.out.println(r1.isBlank());    //true
		System.out.println(r2.isBlank());    //true
		System.out.println("^^^^^^^^^^^^^^^^^");
		
		//8.charAt method use
		
		String t="Hyderabad"; //01234578
		
		System.out.println(t.charAt(0)); //character at index value ...index start from 0
		
		char ans=t.charAt(0);  //return type is letters i.e.character
		System.out.println(ans); //to use in future
		
		System.out.println(t.charAt(1));
		System.out.println(t.charAt(0));
	    System.out.println(t.charAt(5));
	    System.out.println(t.charAt(8));
	    //System.out.println(t.charAt(9)); //StringIndexOutOfBoundsException
	    //System.out.println(t.charAt(-1)); //StringIndexOutOfBoundsException
	    System.out.println("#################");
	    
	    //9.ends with method use
	    
	    String n="abcd";
	    
	    System.out.println(n.endsWith("d"));   
	    System.out.println(n.endsWith("a")); 
	    System.out.println(n.endsWith("cd"));
	    System.out.println(n.endsWith("Cd")); //case sensitive
	    System.out.println(n.endsWith("bcd"));
	    System.out.println(n.endsWith("abcd")); 
	    System.out.println(n.endsWith("cbd")); //not in sequence
	    System.out.println(n.endsWith("abc"));
	    System.out.println("@@@@@@@@@@@@@@@@@@@");
	    
	    //10.Starts with method
	    
	    String i="india";
	    
	    System.out.println(i.startsWith("in"));
	    System.out.println(i.startsWith("Ind")); //case sensitive
	    System.out.println(i.startsWith("india"));
	    System.out.println(i.startsWith("ndia"));
	    
	    System.out.println(i.startsWith("dia", 2)); //true if d index 2..starting point here
	    System.out.println(i.startsWith("ia", 2)); //if int 3 given then true
	    System.out.println(i.startsWith("a", 4)); 
	    System.out.println("$$$$$$$$$$$$$$$");
	    
	    //11.substring method use
	    
	    String m="Maharashtra";
	    
	    System.out.println(m.substring(4));
	    
	    String str=m.substring(4);
	    System.out.println(str); //use in future
	    System.out.println(m.substring(2)); //print from index 2
	    System.out.println(m.substring(0));
	    System.out.println(m.substring(1, 4)); //start at index1 and 4 means it will end at index 3..always less 1
	    System.out.println(m.substring(1, 5)); 
	    
	    
	    
		

	}

}
