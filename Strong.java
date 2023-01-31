// WAP to check whether a number is Strong number or not.
import java.util.*;
class Strong
  {
    public static void main(String args[])
    {
      int num,sum=0,digit=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("the strong number is ");
      num=sc.nextInt();
      int temp=num;
      while(num>0)
        {
         digit=num%10;
          int fact=1;
          for(int i=1;i<=digit;i++)
         {
            fact=fact*i;
          }
          System.out.println(fact);
          sum=sum+fact;
          num=num/10;
        }
          if(temp==sum)
          {
         System.out.println("the strong number ") ;
        }  
          else
         System.out.println("not a strong number ");               
    }
  }