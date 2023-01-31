import java.util.*;
class NoMethod
  {
    public static void add()
    {
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the num value");
      int num =sc.nextInt();
      if(num%2==0)
      {
       System.out.println("enter the even number"); 
      }
      else{
        System.out.println("value is not a even number");
      }
    }
    public static void main(String args[])
    {
      System.out.println("the excaution start from this line ");
      add();
    }
  }