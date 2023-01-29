// WAP to print all Prime numbers between 1 to n.
import java.util.*;
class Prime
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("the prime numbers are ");
      n=sc.nextInt();
      for(i=1;i<=0;i++)
        {
          int count=0;
          for(int j=2;j<i;j++)
            {
          if(i%j==0){
          System.out.print(i+" ");
          }
        }
    }
  }