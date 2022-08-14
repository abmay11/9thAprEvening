package ControlStatement;

public class May10ElseIf {

	public static void main(String[] args) {
		 //eg.
		 //if its summer then its very hot
		 // if its rainy then its raining heavily 
		 // if its winter then its very cold
		 // invalid season

		String season="rainy";
		
		if (season=="summer")//remember syntax..start with if..in between else if...end with else
		{
			System.out.println("its very hot");
		}
		else if (season=="rainy")
		{
			System.out.println("its raining heavily");
		}
		else if (season=="winter")
		{
			System.out.println("its very cold");
		}
		else
		{
			System.out.println("invalid season");
		}
	}

}
