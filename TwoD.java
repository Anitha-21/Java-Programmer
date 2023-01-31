
class TwoD
  {
    public static void main(String args[])
    {
      int a[][]=new int[2][2];
      a[0][0]=34;
      a[0][1]=45;
      a[1][0]=78;
      a[1][1]=56;
      System.out.println("the array element are");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
    }
  }

/* import java.util.*;
class TwoD
  {
    public static void main(String args[])
    {
      int r,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter row size and column size");
      r=sc.nextInt();
      c=sc.nextInt();      
      int a[][]=new int[r][c];
      System.out.println("enter the values in to 2D array");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              a[i][j]=sc.nextInt();
            }
        }
      System.out.println("the array element are");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              System.out.print("["+i+"]["+j+"]: "+a[i][j]+" ");
            }
          System.out.println();
        }
           */