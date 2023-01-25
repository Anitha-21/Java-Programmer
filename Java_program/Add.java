// write a program to print the a odd variable
import java.util.*;
class Add
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      num=sc.nextInt();
      if(num%2!=0)
      {
        System.out.println("the number is odd");
      }
      else
        System.out.println("the number is not odd");
   
    }          
 }