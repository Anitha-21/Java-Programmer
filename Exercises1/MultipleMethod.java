import java.util.*;
class MultipleMethod
  {
    public static void multiple()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value");
      int a=sc.nextInt();
      System.out.println("enter the b value");
      int b=sc.nextInt();
      int multiple=a*b;
      System.out.println("the multiple the values are "+multiple);
    }
      public static void main(String args[])
    {
      System.out.println("the execut values are ");
      multiple();
    }    
  }