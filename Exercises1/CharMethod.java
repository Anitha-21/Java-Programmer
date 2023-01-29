import java.util.*;
class CharMethod
  {
    //with return type without parameters/ Arguments
    public static char sum()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a,b values");
      char a=sc.next().charAt(0);
      char b=sc.next().charAt(0);
      char c='a'+'b';
      return c;
    }
    public static void main(String args[])
    {
     
      char result=sum();
      System.out.println("the sum of two numbers is :"+result);
    }
  }