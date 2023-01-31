//WAP to print multiplication table of any number.
import java.util.*;
class Table
  {
    public static void main(String args[])
    {
      int i=1,x,n;
      Scanner sc= new Scanner(System.in);
      System.out.println("the table is");
      x=sc.nextInt();
      System.out.println("the n value is ");
     n=sc.nextInt();
      for(i=1;i<=n;i++)
        {
          //int result=(x*i);
          System.out.println(x+"*"+i+"="+(x*i));
        }
    }
  }