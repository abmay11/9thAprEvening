package collection;

import java.util.ArrayList;

public class June28ArrayList {

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList(); //created object of ArrayList //heterogeneous type..thats y return type is object in for each loop
		
		al.add("Velocity");
		al.add(189);
		al.add(99.99); //no need to declare f for float
		al.add(null);
		al.add(true);
		al.add(null);
		al.add('C');
		al.add("Velocity");
		
		System.out.println(al);
		System.out.println();
		
		System.out.println(al.size()); //size=index+1=8
		System.out.println(al.isEmpty());//
		System.out.println();
		
		System.out.println(al.get(0));
		System.out.println(al.get(7));
		System.out.println();
		
		System.out.println(al.indexOf(null)); //takes null which comes 1st in the list
		System.out.println(al.indexOf('C'));
		System.out.println(al.lastIndexOf(null));
		System.out.println();
		
		System.out.println(al.contains("Velocity")); //case sensitive
		System.out.println(al.contains("velocity"));
		System.out.println();
		
		System.out.println(al.remove(0)); //index basis //remove from list and return that removed element in console);//left shit--> when you try to remove/delete from in between of arraylist
		al.set(0,"acceleration"); //update value
		System.out.println(al); //after removing and updating
		System.out.println();
		
		al.add(1, "Mumbai"); //cant use in println stmnt");// right shift--> when you are inserting element in between arraylist
		System.out.println(al);
		System.out.println("************");
		
		System.out.println(al.remove(99.99)); //element basis//true
		System.out.println(al);
		System.out.println("==============");
		
//verticle printing
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
		System.out.println(al.get(5));
		System.out.println(al.get(6));
		System.out.println("============");
		
//printing element using for loop(Static or Hard coding)
		//forward
		for(int i=0;i<=6;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("$$$$$$$$$$$$$$");
		
		//backward
		for(int i=6;i>=0;i--)
		{
			System.out.println(al.get(i));
		}
		System.out.println("@@@@@@@@@@@");
		
//printing element using for loop(dynamic coding)
		//forward
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("==========");
		
		//backward
		for(int i=al.size()-1;i>=0;i--)
		{
			System.out.println(al.get(i));
		}

	}

}
