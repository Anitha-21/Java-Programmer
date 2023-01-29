//WAP to check whether a character is alphabet or not.
import java.util.*;
class Character
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character ");
      ch=sc.next().charAt(0);
      if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
    {
      System.out.println(ch+ " is an Alphabet ");
    } 
   else
    System.out.println(ch+ " is not an Alphabet ");
    }
  }