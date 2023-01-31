
import java.util.*;
class TwoDAdd
  {
    public static void main(String args[])
    {
      int r,c;
        Scanner sc=new Scanner(System.in);
      System.out.println("the size of the array is");
      r=sc.nextInt();
      c=sc.nextInt();
      int a[][]=new int[r][c];
      System.out.println("the array elements ");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
            a[i][j]=sc.nextInt();
            }
        }
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {  
       System.out.print(a[i][j]+" ");
           }
          System.out.println(" ");
           }
      
    }
  }