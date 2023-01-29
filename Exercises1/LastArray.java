
import java.util.*;
class LastArray
{
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size : ");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter the elements : ");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }  
         n=a.length;
      int b[]=new int[n+1];
      System.out.println("enter the element to insert : ");
      int ele=sc.nextInt();
      int i;
      for(i=0;i<n;i++)
        {
          b[i]=a[i];
        }
      b[i]=ele;
    System.out.println("elements  in the second array ");
      for(i=0;i<b.length;i++)
        {
          System.out.print(b[i]+" ");
        }
    }
  }
