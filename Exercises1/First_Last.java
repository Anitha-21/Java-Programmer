//write a program to print first and last digits
import java.util.*;
class First_Last
  {
    public static void main(String args[])
    {
      int n,first=0,last=0,result=0;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the numbers ");
      n=sc.nextInt();
      last=n%10;
      while(n!=0)
      {
        result=n/10;
        first=n;
        System.out.println(n);
         n=n/10;
      }
    System.out.println("first"+first + " "+"last "+last);
    }
   }
  