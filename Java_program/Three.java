//Write a program to print the three variables
import java.util.*;
class Three
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc= new Scanner(System.in);
      System.out.println("The numbers are a,b,c ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b && a>c)
      {
        System.out.println("the a value is bigger ");
      }
      else if(b>c)
      {
      System.out.println("the b value is bigger ");
      }
      else
        System.out.println("the c value is bigger ");
      
    }
  }