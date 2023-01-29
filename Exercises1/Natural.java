//WAP to find sum of all natural numbers between 1 to n.
import java.util.*;
class Natural
  {
    public static void main(String args[])
    {
      int i,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("sum of natural numbers ");
      n=sc.nextInt();
      i=1;
      while(i<=n)
        {
         // if(i%2==0){
          System.out.print(i+" ");
         // }
          sum=sum+i;
          i++;
        }
      System.out.println("the sum of natural "+sum);
    }
  }