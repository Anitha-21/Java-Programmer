import java.util.*;
class WithMethod
  {
    public static void odd(int num)
    {
     /* Scanner sc=new Scanner(System.in);
      System.out.println("enter the num value ");
      num=sc.nextInt();  */
       num=15;
      if(num%2!=0)
      {
        System.out.println("the value is odd ");
      }
      else
        System.out.println("the value is not odd ");
    }
    public static void main(String args[])
    {
      System.out.println("the exacuation start from ");
      odd(15);
    }
  }