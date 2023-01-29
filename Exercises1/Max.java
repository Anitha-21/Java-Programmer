//WAP to find maximum between two numbers.
import java.util.*;
class Max
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("the value of a is ");
      a=sc.nextInt();
      System.out.println("the value of b is ");
      b=sc.nextInt();
      if(a>b)
      {
       System.out.println("the max value is "+a);
      }
      else  
      {
      System.out.println("the max value is "+b);
      }
    }
  }