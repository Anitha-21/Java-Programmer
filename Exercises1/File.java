//Write a program to print the 1 to n
import java.util.*;
class File
  {
    public static void main(String args[])
    {
      int i=1,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the numbers ");
      n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          System.out.print(i+" ");
        }
    }
  }