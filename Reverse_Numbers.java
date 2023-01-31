/*WAP to print all natural numbers in reverse (from n to 1). -     using while loop */
import java.util.*;
class Reverse_Numbers
  {
    public static void main(String args[])
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("the n value is ");
      n=sc.nextInt();
      i=100;
      while (i>=n)
        {
            System.out.print(i+" ");          
          i--;
        }
    }
  }