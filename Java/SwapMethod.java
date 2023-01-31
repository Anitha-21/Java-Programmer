import java.util.*;
class SwapMethod
  {
    public static void swap()
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a and b values ");
      a=sc.nextInt();
      b=sc.nextInt();
      //after swap
      a=a+b;
      a=a-b;
      b=a-b;
      System.out.println("the swap of a is "+a);
      System.out.println("the swap of b is "+b);
    }
    public static void main(String args[])
    {
    System.out.println("the method start from here ");
      swap();
    }
  }