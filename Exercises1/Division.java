/*WAP to check whether a number is divisible by 5 and 11 or not*/
import java.util.*;
class Division
  {
    public static void main(String args[])
    {
      int a;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number:");
     a=sc.nextInt();
     if (a%5==0&&a%11==0)
    { 
      System.out.println("the number is divided ");
    }
    else 
    {
      System.out.println("the number is not divided ");
    }
   }
  }