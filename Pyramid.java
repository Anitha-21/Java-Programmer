//write a program to print the pyramid
import java.util.*;
class Pyramid
  {
      public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("the value is ");
     int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          for(int j=i;j<=n;j++)
            {
              System.out.print(" ");
            }
          for(int k=1;k<=i;k++)
          {
          System.out.print("*"+" ");
          }
          System.out.println();
        }
    }
  }
//for(j=(n-i);j>=0;j--)