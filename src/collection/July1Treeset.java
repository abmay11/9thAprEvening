package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class July1Treeset {

	public static void main(String[] args) 
	{
		TreeSet tr=new TreeSet();
		
		tr.add(6);
		//tr.add("abc");   // class cast exception //treeset accept only homogeneous data
		tr.add(3);
		tr.add(7);
		tr.add(4);
		tr.add(9);
		tr.add(1);
		//tr.add(null);  //null pointer exception
		tr.add(6); 
		
		System.out.println(tr);
		System.out.println("================");
		
		//tr.add("Infosys"); // class cast exception
		
		//for each
		System.out.println("for each");
		
		for(Object w:tr)
		{
			System.out.println(w);
		}
		
		System.out.println("==================");
		
		//iterator
		System.out.println("Iterator");
		
		Iterator it = tr.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
