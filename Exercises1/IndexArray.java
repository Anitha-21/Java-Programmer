

import java.util.*;
class IndexArray
  {
    public static void main(String args[])
    {
      int size;
      Scanner sc=new Scanner(System.in);
   System.out.println("the size ofthe array is : ");
      size=sc.nextInt();
      int a[]=new int[size];
      int count=0;
      System.out.println("enter array elements : ");
      for(int i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the array elements are : ");
      for(int i=0;i<a.length;i++)
        {
      if(i%2==0)
      {
        count++;
    System.out.print(a[i]+" ");      
      }
        }
      System.out.println(" the count of array is "+count);
    }
  }