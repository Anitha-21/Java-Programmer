 /*WAP to input any character and check whether it is alphabet, digit    or special character.*/
import java.util.*;
class Special
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("the character are ");
     ch =sc.next().charAt(0);
      if((ch>='A' && ch<='Z' || ch>='a' && ch<='z'))
      {
        System.out.println("the alphabet ");
      }
     else if(ch>='0' && ch<='9')
      {
        System.out.println("the digit ");
      }
      else
        System.out.println("the special character");
    }
  }