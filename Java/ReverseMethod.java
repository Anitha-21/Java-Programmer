import java.util.*;
class ReverseMethod
  {
   public static void reverse()
    {
      int i,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("the reverse numbers are");
      n=sc.nextInt();
      i=50;
      while(i>=0)
        {
          System.out.print(i+", ");
          i--;
        }
    }
    public static void main(String args[])
    {
      reverse();
    }
  }