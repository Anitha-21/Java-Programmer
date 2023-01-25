//Write a program to print the char
import java.util.*;
class Char
{
  public static void main(String args[])
  {
    char a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    a=sc.nextInt();
    if (a%5==0&&a%11==0)
    { 
      System.out.println("the number is divided ");
    }
    else 
    {
      System.out.println("the number is not divided ");
    }
  }
}