//Write a program to print the down side triangle
import java.util.*;
class ReversePyramid
  {
      public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("the value is ");
     int n=sc.nextInt();
      for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print(" ");
            }
          for(int k=n;k>=i;k--)
          {
          System.out.print("*");
          }
          System.out.println();
        }
    }
  }