package VariableStudy;

public class Apr25NumericDecimal {

	public static void main(String[] args) 
	{
		
		//ex1.float(after decimal less digits than double )
		
		float weight;//Float capital F also possible
		
		//have to mention f in float while initialisation
		// o/p will get round off
		weight=9.123456789f;
		
		System.out.println("My weight is "+weight);
		
		//ex2.double
		
		double height;
		
		//not compulsory to mention d in double while initialisation like f in float compulsory if dont need exact decimals
		height=9.123456789123456789;
		
		System.out.println("My height is "+height);
		
		

	}

}
