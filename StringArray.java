/*Write a program to print the string array using for loop */
import java.util.*;
class StringArray
  {
    public static void main(String args[])
    {
      String a[]=new String[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the values ");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.next();
        }
      System.out.println("the array values are");
      for(int i=0;i<5;i++)
        {
          System.out.print(a[i]+" ");
        }
    }
  }