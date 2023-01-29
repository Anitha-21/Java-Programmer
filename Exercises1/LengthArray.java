
import java.util.*;
class LengthArray
  {
    public static void main(String args[])
    {
       float a[]=new float[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the values ");
      for(int i=0;i<5;i++)
        {
          a[i]=sc.nextFloat();
        }
      System.out.println("the array values are");
      for(int i=0;i<5;i++)
        {
          System.out.print(a[i]+" ");
        }
      System.out.println("the length of the array "+a.length);
    }
  }
