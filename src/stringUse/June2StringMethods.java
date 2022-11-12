package stringUse;

public class June2StringMethods {

	public static void main(String[] args) 
	{
	//1.USE OF LENGTH METHOD
		
		//press ctrl and click on String below to see detils of String..which is class AND final
		
		String s="Hi"; //created string w/t using new keyword..here s is object of class String
		String s1=new String("bye"); //created string using new keyword..s1=bye
		
		System.out.println(s.length()); //string class..return type will be int..since it is length-->hi=2
		System.out.println(s1.length()); //length-->bye=3
		System.out.println("===========");
		
		//to use it in future assign length with variable..we know length will be integer value
		int length=s.length();
		System.out.println(length); 
		int length1=s1.length();
		System.out.println(length1);
		System.out.println(">>>>>>>>>>>>");
		
		String s2=""; //zero space
		System.out.println(s2.length());
		System.out.println("/////////////");
		
	    String s3=null; //       
		System.out.println(s3);  //only printing not doing any operations..so No null pointer exception
		//System.out.println(s3.length());  it is called as null exception..if we will run it...whatever until above will run upto exception
		
	//2.USE OF toUpperCase() method
		
		String a="acceleration"; //created string w/t using new keyword
		System.out.println(a);
		System.out.println(a.toUpperCase());
		
		String b=a.toUpperCase();  //use in future
		System.out.println(b);
		
		String h=new String("velocity"); //created string using new keyword
		System.out.println(h);           //h=velocity
		System.out.println(h.toUpperCase());
		
		String upper=h.toUpperCase();   //use in future
		System.out.println(upper);
		System.out.println("==============");
		
	//3.Use of toLowerCase
		
		System.out.println(upper.toLowerCase());
		System.out.println("||||||||||||||||||");
		
		//4.use of equals()method
		String d0="distance";
		String d1="distance";
		String d2=new String("distance");
		String d3=new String("distance");
		String d4=new String("Distance");
		
		System.out.println(d0==d1); //its check memory location not content (==)
	    System.out.println(d1==d2);
	    System.out.println(d2==d3);
	    System.out.println(d3==d4);
	    System.out.println("*********************");
	    
	    System.out.println(d0.equals(d1)); //check content not memory location
	    System.out.println(d1.equals(d2));
	    System.out.println(d2.equals(d3));
	    System.out.println(d3.equals(d4)); //case sensitive
	    System.out.println("\\\\\\\\\\\\");
	    
	    //5.Use of Equals IgnoreCase
	    System.out.println(d3.equalsIgnoreCase(d4)); //ignoring upper or lower case if remaining same 
	
	
	}

}
