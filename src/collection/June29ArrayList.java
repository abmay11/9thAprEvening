package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class June29ArrayList {

	public static void main(String[] args) 
	{
        ArrayList al=new ArrayList(); //created object of ArrayList
		
		al.add("Velocity");
		al.add(189);
		al.add(99.99); //no need to declare f for float
		al.add(null);
		al.add(true);
		al.add(null);
		al.add('C');
		al.add("Velocity");
		
//For each loop
		System.out.println("OUTPUT USING FOR EACH LOOP");
		for(Object p:al) //variable can be any letter ie a,b,c...z
		{
			System.out.println(p);
		}
		System.out.println("===========================");
		
//iterator
		System.out.println("OUTPUT USING ITERATOR");
		Iterator it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("@@@@@@@@@@@@@@@@@");
		
//listIterator
		System.out.println("OUTPUT USING LIST ITERATOR");
		ListIterator li = al.listIterator();
		
		while(li.hasNext()) //it also contain has previous method in addition to iterator
		{
			System.out.println(li.next());
		}
		System.out.println("===========================");
		
		

	}

}
