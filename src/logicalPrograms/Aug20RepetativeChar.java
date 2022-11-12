package logicalPrograms;

import java.util.HashMap;
import java.util.Set;

public class Aug20RepetativeChar 
{

	public static void main(String[] args) 
	{
		String h="abaabbcabbcq";
		
		HashMap<Character, Integer> mp= new HashMap<Character, Integer>();
		
		for(int i=0;i<=h.length()-1;i++)
		{
			
			char charKey = h.charAt(i);
			
			if(mp.containsKey(charKey))
			{
				mp.put(charKey,mp.get(charKey)+1);
			}
			else
			{
				mp.put(charKey, 1);
			}
		}
		//System.out.println(mp);

		//for better representation converting into keyset
		Set<Character> allChar = mp.keySet();
		
		for(Character al:allChar)
		{
			System.out.println(al+" : "+mp.get(al));
		}
		
	}

}
