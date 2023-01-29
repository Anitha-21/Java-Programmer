
import java.util.*;
class AddArrayKb
  {
     public static void main(String args[])
    {
   int r,c;
    Scanner sc=new Scanner(System.in);//1 mat
    System.out.println("the rows size  and colum size :");
    r=sc.nextInt();
    c=sc.nextInt();
   int a[][]=new int[r][c];
    System.out.println("enter the values in to first array");
    for(int i=0;i<r;i++) //for rows
      {
        for(int j=0;j<c;j++)//foe colum
          {
           a[i][j]=sc.nextInt();
          }
      }
    System.out.println("the rows size  and colum size for the second array :");//2 mat
    int x=sc.nextInt();
    int y=sc.nextInt();
    int arr[][]=new int[x][y];
    System.out.println("enter the values in to Second array");
        for(int i=0;i<x;i++) //for rows
      {
        for(int j=0;j<y;j++)//foe colum
          {
           arr[i][j]=sc.nextInt();         
         }   
      }
    int sum[][]=new int[r][c];
    for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
          {
            sum[i][j]=a[i][j]+arr[i][j];
          }
      }
  System.out.println("enter the resultant array elements");
   for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
          {
            System.out.print(sum[i][j]+" ");
          }
        System.out.println();
        }

    }
  }