//write a program to print the reverse number
import java.util.*;
class Reverse_Digit
  {
    public static void main(String args[])
    {
      int n,result=0,reverse=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number ");
      n=sc.nextInt();
      while(n>0)
        {
         result = n % 10;
         reverse = reverse * 10 + result;
          n=n/10;
        }
      System.out.println("the reverse number is "+reverse);
    }
  }