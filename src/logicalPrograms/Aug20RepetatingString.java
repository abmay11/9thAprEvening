package logicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class Aug20RepetatingString 
{

	public static void main(String[] args) 
  {
		String w="abc dfg hyr saz";
		
		String ar[]=w.split(" ");
		//{"abc","dfg","hyr","saz"}
		
		HashMap<String, Integer> mp=new HashMap<String,Integer>();

		for(int i=0;i<=ar.length-1;i++)
	 {
			String s = ar[i];
		
		if(mp.containsKey(s))
		{
			mp.put(s , mp.get(s)+1);
		}
		else
		{
		mp.put(s, 1);	
		}
	 }
		Set<String> allString = mp.keySet();
		for(String al:allString)
		{
			System.out.println(al+" : "+mp.get(al));
		}

  }
}