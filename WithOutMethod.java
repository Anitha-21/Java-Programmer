import java.util.*;
class WithOutMethod
  {
    public static int multiple(int a,int b)
    {
      int c=a*b;
      return c;
    }
    public static void main(String args[])
    {
   Scanner sc=new Scanner(System.in);
      System.out.println("enter the x value ");
      int x=sc.nextInt();
      System.out.println("enter the y value ");
      int y=sc.nextInt();
      int z=multiple(x,y);
      int result=multiple(10,15);
      System.out.println("the multiple of the values are "+z+"  "+result);
      
    }
  }























/*  import java.util.*;
class WithOutMethod
  {
    public static int multiple()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value ");
      int a=sc.nextInt();
      System.out.println("enter the b value ");
      int b=sc.nextInt();
      int c=a*b;
      return c;
    }
    public static void main(String args[])
    {
      int result=multiple();
      System.out.println("the multiple of the values are "+result);
    }
  }   */