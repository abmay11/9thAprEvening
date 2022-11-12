package arrayStudy;

public class June22SplitMethodUse {

	public static void main(String[] args) 
	{
		String name="Velocity Corporate Training Center";
		
		String names[]=name.split(" "); //split on the basis of space which is common

		for(int i=0;i<=3;i++)
		{
			System.out.println(names[i]);
		}
		
		
//dynamic way..for loop..same eg
		
		String name1="Velo Corpo Train Center";
	
		String sp[]=name1.split(" ");
		
		for(int i=0;i<=sp.length-1;i++)
		{
			System.out.println(sp[i]);
		}
		
		
	}

}
