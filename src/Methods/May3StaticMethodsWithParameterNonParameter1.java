package Methods;

public class May3StaticMethodsWithParameterNonParameter1 {

public static void test2()//static regular method w/t parameter
{
	String PRN="AUOPN2526J";//to call alphabate+number type use string
	System.out.println("Rajesh PRN number is "+PRN);
}

public static void test3(String QRN) //static regular method with parameter
{
	
	System.out.println("Mahesh QRN number is "+QRN);
}

public void check1() //non static regular method w/t parameter
{
	char gender='F';
	System.out.println("Gender of category "+gender+" should come first in que");
	
}

public void check2(char result) 
{
System.out.println("Rakesh result is "+result);
}
}