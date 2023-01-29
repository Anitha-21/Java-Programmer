//WAP to find sum of all even numbers between 1 to n.
import java.util.*;
class Even_Numbers
  {
    public static void main(String args[])
    {
      int i=1,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("the even numbers ");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          if(i%2==0){
          System.out.println(i+" ");
           sum=sum+i; 
          }
        }
      System.out.println("the even numbers are "+sum);
    }
  }