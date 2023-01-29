/*WAP to check whether a number is negative, positive or zero.*/
import java.util.*;
class Negative
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc=new Scanner(System.in);
      System.out.println("the value of a is ");
      a=sc.nextInt();
      if(a>0)
      {
        System.out.println("the value is positive ");
      }
      else if(a<0)
      {
        System.out.println("the value is negative");
      }
      else
        System.out.println("the value is zero");
    }
  }