
import java.util.*;
class FirstArray
  {
  public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
      size=sc.nextInt();
      int arr[]=new int[size];
      int newarr[]=new int[size+1];
      System.out.println("enter the elements ");
      for(int i=0;i<arr.length;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("enter the position of element you want to insert");
      int pos=sc.nextInt();
      System.out.println("enter the element you want to insert");
      int ele=sc.nextInt();
      for(int i=0;i<arr.length;i++)
        {
          if(i==pos)
          {
            newarr[i]=ele;
            newarr[i+1]=arr[i];
          }
          else
            newarr[i+1]=arr[i];
        }
      System.out.println("after inserting the element");
      for(int i=0;i<newarr.length;i++)
        {
          System.out.print(newarr[i]+" ");
        }
    }
  }