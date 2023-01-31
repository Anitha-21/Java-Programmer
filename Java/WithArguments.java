import java.util.*;
class WithArguments
  {
    public static int divided(int a,int b)
    {
     /* Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value is ");
      a=sc.nextInt();
      System.out.println("enter the b value is ");
      b=sc.nextInt();  */
      int c=a/b;
      return c;
    }
    public static void main(String args[])
    {
      int result=divided(15,2);
      System.out.println("the result is "+result);
    }
  }