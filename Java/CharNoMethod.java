import java.util.*;
class CharNoMethod
  {
    public static boolean value()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a values is ");
      int a=sc.nextInt();
    if(a%5==0&&a%11==0)
    {
      return true;
    }
      else
    return false; 
    }
    public static void main(String args[])
    {     
      boolean b=value();
      System.out.println(b);
    }
  }