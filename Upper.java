/*  WAP to check whether a character is uppercase or lowercase     alphabet. */
import java.util.*;
class Upper
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("the upper and lower values are ");
      ch=sc.next().charAt(0);
      if(ch>='A' && ch<='Z')
      {
        System.out.println("the upper values");
      }
      else if(ch>='a' && ch<='z')
      {
        System.out.println("the lower values");
      }
      else
        System.out.println("invalid values");
    }
  }