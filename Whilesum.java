//write a program to print is while sum
import java.util.*;
class Whilesum
  {
    public static void main(String aegs[])
    {
      int i=1,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("the numbers ");
      n=sc.nextInt();
      while(i<=1)
        {
          if (i%2!=0){
            System.out.println(i);
          i++;
          sum=sum+i;
          }
        }
      System.out.println("the sum of numbers are "+sum);
    }
  }