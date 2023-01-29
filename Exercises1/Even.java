// WAP to check whether a number is even or odd.
import java.util.*;
class Even
  {
    public static void main(String args[])
    {
      int a,b;
      Scanner sc= new Scanner(System.in);
      System.out.println("the value of a is ");
      a=sc.nextInt();
      b=a%2;
      if (b==0)
      {
        System.out.println("the value is even ");
      }
      else if(b==1)
      {
        System.out.println("the value is odd ");
      }
      else
        System.out.println("invalid value");
    }
  }