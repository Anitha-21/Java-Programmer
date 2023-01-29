//WAP to find sum of all odd numbers between 1 to n.
import java.util.*;
class Odd
  {
    public static void main(String args[])
    {
      int i=1,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("the odd numbers are ");
      n=sc.nextInt();
      for (i=1;i<=n;i++)
        {
          if(i%2==1){
          System.out.println(i+" ");
            sum=sum+i;
          }
        }
      System.out.println("the odd numbers "+sum);
    }
  }