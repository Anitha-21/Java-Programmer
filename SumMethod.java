import java.util.*;
class SumMethod
  {
    public static void sum()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value");
      int a=sc.nextInt();
     System.out.println("enter b value");
      int b=sc.nextInt();
      int sum=a+b;
      System.out.println("the sum of two numbers is :"+sum);
    }
    public static void main(String args[])
    {
      System.out.println("execution starts form main method");
      sum();
      System.out.println("after calling the sum() this line going to be executed");
      sum();
    }
  }
  