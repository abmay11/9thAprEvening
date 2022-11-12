package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class June30LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList<Double> ll=new LinkedList<>();
		
		ll.add(63.69);
		ll.add(84.33333);
		ll.add(56.87);
		
		System.out.println(ll);
		ll.add(2, 99.99);
		System.out.println(ll);
		ll.remove(0);
		
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.println(ll.get(i));
		}
		System.out.println("============");
		
		for(Double p:ll)
		{
			System.out.println(p);
		}
		System.out.println("@@@@@@@@@@@");
		
		Iterator<Double> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("##########");
		
		ListIterator<Double> li = ll.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}

	}

}
