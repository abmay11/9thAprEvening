package Assignments;

public class demo 
{
	int a,b,sum;

    public demo()
   {
     a=10;b=20;
   }

    public static void main(String[]args)
   {
    demo g= new demo();
     g.add();
   }

   public void add()
   {
    sum=a+b;
    System.out.println(sum);
   }


}
