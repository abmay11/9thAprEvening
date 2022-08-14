package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class July1LinkedHashSet {

	public static void main(String[] args) 
	{
		LinkedHashSet li=new LinkedHashSet();
		
		li.add("Pune");
		li.add(489);
		li.add(45.23);
		li.add('S');
		li.add(null);
		li.add(null);
		li.add("Pune");
		li.add("pune");
		li.add(489);
		
		System.out.println(li);
		System.out.println("================");
		
		//for each method
		System.out.println("For each");
		
		for(Object k:li)
		{
			System.out.println(k);
		}
		
		System.out.println("=================");
		
		//iterator
		System.out.println("Iterator");
		
		Iterator it = li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	

	}

}
