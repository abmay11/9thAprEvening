package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class June29ArrayListHomo {

	public static void main(String[] args) 
	{
		//start typing from left then ctrl+space
	  ArrayList<Integer> al=new ArrayList<>(); //we can use any variable i.e.String,float etc
	  
	  al.add(1);
	  al.add(2);
	  al.add(3);
	  al.add(4);
	  al.add(5);
	  al.add(6);
	  System.out.println(al);
	  System.out.println("===============================");
	  
	  
	  //for each loop
	  System.out.println("for each loop o/p");
	  
	  for(Integer i:al)
	  {
		  System.out.println(i);
	  }
	  System.out.println("=================================");

	  
	  //iterator
	  System.out.println("iterator o/p");
	  
	  Iterator<Integer> it= al.iterator();
	  
	  while(it.hasNext())
	  {
		  System.out.println(it.next());
	  }
	  System.out.println("===============================");
	  
	  //list iterator
	  System.out.println("list iterator o/p");
	  
	  ListIterator<Integer> li=al.listIterator();
	  
	  while(li.hasNext())
	  {
		  System.out.println(li.next());
      }
	  System.out.println("============================");
	  
	  
	  
	}

}
