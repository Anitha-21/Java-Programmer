//WAP to find maximum between three numbers.
import java.util.*;
class Max_Three
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("the value of a is ");
      a=sc.nextInt();
      System.out.println("the value of b is ");
      b=sc.nextInt();
      System.out.println("the value of c is ");
      c=sc.nextInt();
      if(a>b)
      {
        System.out.println("the max value is "+a);
      }
      if(b>c)
      {
        System.out.println("the max vaiue is "+b);
      }
      else
        System.out.println("the max value is "+c);
    }
  }