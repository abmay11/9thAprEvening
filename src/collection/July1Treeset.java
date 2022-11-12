package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class July1Treeset {

	public static void main(String[] args) 
	{
		TreeSet tr=new TreeSet();  //only homogeneous allowed..no concept of hetero here
		
		tr.add(6);
		//tr.add("abc");   // class cast exception //treeset accept only homogeneous data
		tr.add(3);
		tr.add(7);
		tr.add(4);
		tr.add(9);
		tr.add(1);
		tr.add(6);
		//tr.add(null);  //null pointer exception
		 
		
		System.out.println(tr); //ascending..no null..no repetition
		System.out.println("================");
		
		//tr.add("Infosys"); // class cast exception
		
	//does not support for loop----->get method is not available
		
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
