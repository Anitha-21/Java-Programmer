//write a program to print the postivie or negative
import java.util.*;
class Two_Numbers
  {
    public static void main(String args[])
    {
      int a;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter the value: ");
      a=sc.nextInt();
      if(a>0)
      {
        System.out.println("the value is positive ");
      }
      else
        System.out.println("the value is negative ");
      
    }
  }