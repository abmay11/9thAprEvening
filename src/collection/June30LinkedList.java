package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class June30LinkedList {

	public static void main(String[] args) 
	{
		
		LinkedList ll=new LinkedList();
		
		ll.add("Velocity");
		ll.add('A');
		ll.add(99.36);
		ll.add(125);
		ll.add(true);
		ll.add(null);
		ll.add('A');
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.get(5));
		System.out.println("======================================");
		
		System.out.println(ll.peek()); //returns 1st element //to see defn just move cursor on word 
		System.out.println(ll); //not removing element
		
		System.out.println(ll.peekFirst()); //same as peek 
		System.out.println(ll);
		
		System.out.println(ll.peekLast()); //returns last element
		System.out.println(ll);
		System.out.println("====================================");
		
		System.out.println(ll.poll()); //returns 1st element and removes
		System.out.println(ll);
		System.out.println(ll.pollFirst()); //same as poll
		System.out.println(ll);
		System.out.println(ll.pollLast());//returns 1st element and removes
		System.out.println(ll);
		
		System.out.println("=============================");
		
		//for loop
		System.out.println("FOR LOOP");
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("******************************");
		
		for(int i=ll.size()-1;i>=0;i--)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("=========================");
		
		//for each loop
		System.out.println("FOR EACH LOOP");
		
		for(Object f:ll)
		{
			System.out.println(f);
		}
		System.out.println("========================");
		
		//iterator
		System.out.println("Iterator");
		
		Iterator it = ll.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("======================");
		
		//list iterator
		System.out.println("List Iterator");
		
		ListIterator li = ll.listIterator();
		
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}

}
