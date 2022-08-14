package arrayStudy;

public class May8ArrayEg2 {

	public static void main(String[] args) 
	{
		String city[]=new String[3]; //only declaration..
		//eg.1
		//1.declaration+2.initialization
		
		String city1[]= {"Pune","Mumbai",null,"Nagpur"};
		
		System.out.println(city1[0]);
		System.out.println(city1[1]);
		System.out.println(city1[2]);
		System.out.println(city1[3]);
		System.out.println("===============");
		
		for(int i=0;i<=city1.length-1;i++)
		{
			System.out.println(city1[i]);
		}
		
		//eg2.
		char grade[]= {'A','B','C'};
		
		System.out.println(grade[2]);
		
		//eg3.
		int rollnum[]= { }; //length=0
		
		//System.out.println(rollnum[0]); //ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
		
	

	}

}
