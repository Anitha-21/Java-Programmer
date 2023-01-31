/* WAP to print all natural numbers in reverse (from n to 1). -     using while loop */
import java.util.*;
class Reverse
  {
    public static void main(String args[])
    {
      int i=50,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("the reverse numbers are");
      n=sc.nextInt();
      i=50;
      while(i>=0)
        {
          System.out.println(i);
          i--;
        }
    }
  }