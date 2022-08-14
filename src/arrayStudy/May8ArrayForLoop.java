package arrayStudy;

public class May8ArrayForLoop 
{

	public static void main(String[] args) 
	{
		//i want to store city names
		
				//1.Array declaration
				String city[]=new String[5]; //length=5 index=4
				
				//2.Array initialization
				city[0]="Shelu";
				city[2]="Thane";
				city[3]="Dhule";
				city[4]=null;
				//city[5]="abcd"; //ArrayIndexOutOfBoundsException..5 means actually 4 since index starting from 0
				
				//static testing
				for(int i=0;i<=4;i++) //forward
				{
					System.out.println(city[i]);
				}
				
				System.out.println("================");
				
				for (int i=4;i>=0;i--) //backward
				{
					System.out.println(city[i]);
				}
				
				System.out.println("==============");
				
				System.out.println(city.length);
				System.out.println("==============");
				
				//dynamic testing
				
				for (int i=0;i<=city.length-1;i++) //whatever will be array capacity..no need to change syntax
				{
					System.out.println(city[i]);
				}
				
				System.out.println("==============");
				
				for (int i=city.length-1;i>=0;i--)
				{
					System.out.println(city[i]);
				}
				
					
		

	}

}
