package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class June29VectorStudy {

	public static void main(String[] args) 
	{
		Vector v = new Vector();  //created object of vector class
		
		v.add(123);
		v.add("speed");
		v.add(null);
		v.add(89.25);
		v.add('A');
		v.add(123);
		v.add(123);
		
		System.out.println(v);
		
		System.out.println(v.size());
		v.add(0, "velocity");
		System.out.println(v);
		
		System.out.println(v.contains("Pune"));
		
		v.remove(0);
		System.out.println(v);
		
		System.out.println("================");
		
		//for loop
		System.out.println("for loop o/p");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("========");
		
		for (int i=v.size()-1;i>=0;i--)
		{
			System.out.println(v.get(i));
		}
		System.out.println("===================");
		
		//for each loop
		System.out.println("for each loop");
		for(Object a:v)
		{
			System.out.println(a);
		}
		System.out.println("====================");
		
		//iterator
		System.out.println("iterator");
		
		Iterator it = v.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("====================");
		
		//list iterator
		System.out.println("List iterator");
		
		ListIterator li = v.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
		System.out.println("====================");
		
		
		//enumeration
		System.out.println("Enumeration");
		
		Enumeration enm = v.elements();

		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		System.out.println("==================");
	}

}
