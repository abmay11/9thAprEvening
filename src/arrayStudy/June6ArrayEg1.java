package arrayStudy;

import java.util.Arrays;

public class June6ArrayEg1 
{

	public static void main(String[] args) 
	{ //i want to store city names
		
		//1.Array declaration
		String city[]=new String[5]; //length=5 index=4
		
		//2.Array initialization
		city[0]="Shelu";
		
		city[2]="Thane";
		city[3]="Dhule";
		city[4]=null;
		//city[5]="abcd"; //ArrayIndexOutOfBoundsException..5 means actually 4 .since index starting from 0
		
		//3.Usage
		
		System.out.println(city[3]);
		System.out.println(city[1]); //string default value=null  ..coz we have not initialize city[1] 
		System.out.println(city[4]); //we are not performing any operation on null..so no exception
		//System.out.println(city[19]);//ArrayIndexOutOfBoundsException
		System.out.println(city[0]+" "+city[2]); //not a good practice..just for example
		System.out.println("====================");
		
		//eg2.i want to store marks
		
		int marks[]=new int[3];
		
		marks[0]=86;
		marks[1]=62;
		
		Arrays.sort(marks);   //inbuilt method array class provided by java.util
		
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]); //int default value=0
		//System.out.println(marks[3]); //ArrayIndexOutOfBoundsException
		System.out.println("*******************");
		
		//eg3.storing height
		
		float ht[]=new float[2];
		
		ht[0]=5.8f;
		
		System.out.println(ht[0]);
		System.out.println(ht[1]); //float default value=0.0
		System.out.println("=================");
		
		//eg3.storing grades
		
		char grade[]=new char[2];
		
		grade[0]='A';
		
		System.out.println(grade[0]);
		System.out.println(grade[1]); //no default value of character
		//System.out.println(grade[2]); //ArrayIndexOutOfBoundsException
		

	}

}
