package collection;

import java.util.HashSet;
import java.util.Iterator;

public class June30HashSet {

	public static void main(String[] args) 
	{
		HashSet hs=new HashSet();
		
		hs.add("Velocity");
		hs.add(853);
		hs.add(45.236);
		hs.add('E');
		hs.add(false);
		hs.add(null);
		hs.add('E');
		hs.add(null);
		hs.add(853);
		
		System.out.println(hs); //random and no repetation
		System.out.println(hs); //sequence will remains same further	
		System.out.println("====================");
		
		//does not support for loop----->get method is not available
		
		//for each loop
		System.out.println("FOR EACH LOOP");
		
		for(Object k:hs)
		{
			System.out.println(k);
		}
		System.out.println("====================");
		
		
		//iterator
		System.out.println("Iterator");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
