//write a program to print the Duplicate number
import java.util.*;
class DuplicateArray
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("enter the values ");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("the elements are : ");
    for(int i=0;i<arr.length;i++)
      {
        for(int j=i+1;j<arr.length;j++)
          {
            if(arr[i]==arr[j])
            {
         System.out.println(" is the duplicate number"+arr[j]);
            }
          }
      }
     }
  }
