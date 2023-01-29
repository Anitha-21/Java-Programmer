//write a program to print the Left angle triangle
import java.util.*;
class LeftTriangle
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
          System.out.print("*");
          }
          System.out.println();
        }
    }
  }
/* for(int i=1;i<=n;i++)
  for(int j=(n-1);j>i;j--)
    for(int k=1;k<=i;k++) */