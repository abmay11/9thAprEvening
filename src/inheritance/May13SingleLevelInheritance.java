package inheritance;

public class May13SingleLevelInheritance {

	int p=40;//non static global variable
	static int q=60;//static global variable
	
	public static void main(String[] args) {
		May13SingleLevelInheritance h=new  May13SingleLevelInheritance(); //object created for May13SingleLevelInheritance class
		May13Son s=new May13Son();//object created for May13Son class
		May13Mother m=new May13Mother();//object created for May13Mother class
		
		//non static method from another class
		m.nature(); //using mother object to call mother class method
		s.mobile(); //using son object to call son class method
		s.nature();//using son object to call mother class method
		System.out.println("============");
		
		//static method from another class
		May13Son.laptop();// son calling its own static method
		May13Mother.looks();//mother calling its own static method
		May13Son.looks();//son calling its mother static method
		System.out.println("===========");
		
		//calling static n Non static global variable
		System.out.println("global value of q is "+q);//calling global static variable from same class
		System.out.println(h.p);//calling global non static variable from same class
		System.out.println("============");
		
		System.out.println(s.a);//calling global non static variable from son class using son object
		System.out.println(May13Son.b);//calling global static variable from son class
		System.out.println("=========");
		
		System.out.println(m.k);//calling global non static variable from mother class using mother object
		System.out.println(May13Mother.i);//calling global static variable from mother class
		System.out.println("=========");
		
		System.out.println(s.k);//calling global non static variable from mother class using son object
		System.out.println(May13Son.i);//calling global static variable from mother class using son class

	}

}
