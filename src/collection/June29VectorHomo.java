package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class June29VectorHomo {

	public static void main(String[] args) 
	{
		Vector<Character> ch=new Vector<>(); //CAN'T WRITE char HERE..WRITE character
		 
		ch.add('B');
		ch.add('R');
		ch.add('H');
		ch.add('m');
		ch.add('B');
		ch.add('p');
		
		System.out.println(ch);
		 System.out.println("===============================");
		  
		 //for each loop
		 System.out.println("for each loop");
		  for(Character p:ch)
		  {
			  System.out.println(p);
		  }
		  System.out.println("===============");
		  
		//iterator
		  System.out.println("iterator o/p");
		  
		  Iterator<Character> it = ch.iterator();
		  
		  while(it.hasNext())
		  {
			  System.out.println(it.next());
		  }
		  System.out.println("===============================");
		  
		//list iterator
		  System.out.println("list iterator o/p");
		  
		   ListIterator<Character> li = ch.listIterator();
		  
		  while(li.hasNext())
		  {
			  System.out.println(li.next());
	      }
		  System.out.println("============================");
		  
 //enumeration
			System.out.println("Enumeration");
			
			Enumeration<Character> enm = ch.elements();

			while(enm.hasMoreElements())
			{
				System.out.println(enm.nextElement());
			}
			System.out.println("==================");


	}

}
