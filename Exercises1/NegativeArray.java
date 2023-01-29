
import java.util.*;
class NegativeArray
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
   System.out.println("the size ofthe array is : ");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("enter array elements : ");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the array elements are : ");
      for(int i=0;i<a.length;i++)
        {
      if(a[i]<0)
      {
    System.out.print(a[i]+" ");      
      }
   }
 }
  }
    