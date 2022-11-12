package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class July1LinkedHashSet {

	public static void main(String[] args) 
	{
		LinkedHashSet li=new LinkedHashSet();
		//LinkedHashSet<Character>li1 = new LinkedHashSet<>();
		
		li.add("Pune");
		li.add(489);
		li.add(45.23);
		li.add('S');
		li.add(null);
		li.add(null);
		li.add("Pune");
		li.add("pune");
		li.add(489);
		
		System.out.println(li);  //maintained and no repetition and 1 null only
		System.out.println("================");
		
	//does not support for loop----->get method is not available
		
//for each method
		System.out.println("For each");
		
		for(Object k:li)
		{
			System.out.println(k);
		}
		
//		for(Character k1:li1)
//		{
//			System.out.println(k1);
//		}
		
		System.out.println("=================");
		
//iterator
		System.out.println("Iterator");
		
		Iterator it = li.iterator();
		//Iterator<Character> it1 = li1.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	

	}

}
