//write a program to print the prime numbers
import java.util.*;
class PrimeArray
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      n=sc.nextInt();
      int arr[]=new int[n];
      int count=0;
      System.out.println("enter the values ");
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("the elements are : ");
    for(int i=0;i<arr.length;i++)
      {
        for(int j=2;j<i;j++)
          {
           // arr[i]%arr[j]==0;
            count++;
          }
        if(count==2)
        {
          System.out.println("the prime number is "+arr[j]);
        }
        else
          System.out.println("not a prime number ");
    }
    }
  }
