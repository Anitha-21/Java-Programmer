//WAP to print all odd number between 1 to 100.
import java.util.*;
class Odd_Number
  {
    public static void main(String args[])
    {
      int i=1,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("the odd numbers are ");
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2!=0)
           System.out.print(i+" ");
          i++;
        }
    }
  }