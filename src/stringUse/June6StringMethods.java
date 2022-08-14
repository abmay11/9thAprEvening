package stringUse;

public class June6StringMethods {

	public static void main(String[] args) 
	{
		//12.concat method use
		
		String a1="Govt of ";
		String a2="India";
		
		System.out.println(a1.concat(a2)); //object
		System.out.println(a1.concat("Maharashtra")); //string 
		System.out.println("My "+a1.concat(a2));
		System.out.println("=====================");

		//13.index of method use
		
		String t="Tea";
		int index=t.indexOf('T'); //future use..return type int
		System.out.println(index);
		
		System.out.println(t.indexOf('e'));
		System.out.println(t.indexOf('t')); //garbage value
		System.out.println(t.indexOf('b')); //garbage value
		
		String t1="India is my country which is 2nd biggest";
		
		System.out.println(t1.indexOf('i'));
		System.out.println(t1.indexOf('I'));
		System.out.println(t1.indexOf('n')); //if repeated then takes 1st in line
		System.out.println(t1.indexOf('s')); //index consider spaces also..01234 67
		
		System.out.println(t1.lastIndexOf('n')); //index of 1st n from last 
		System.out.println(t1.lastIndexOf('i')); //index of 1st i from last
		
		System.out.println(t1.indexOf('i', 23)); //index of i before 2nd part..so giving reference of c(index=23)
		System.out.println(t1.indexOf('i', 24)); //index of i before 2nd part..so giving reference of h(index=24)..same o/p
		
		System.out.println("**************");
		
		//14.replace
		String p="bubble";
		
		System.out.println(p.replace('b', 'B'));
		System.out.println(p.replace('e', 'o'));
		System.out.println(p.replace('l', '@'));
		
		System.out.println(p.replace("bu", ""));
		System.out.println(p.replace("bu", "  "));
		System.out.println(p.replace("bu", "do"));
		System.out.println(p.replace("BO", "DPO")); //printing as it is string
		
		

	}

}
