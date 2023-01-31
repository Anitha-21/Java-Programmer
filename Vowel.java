/*WAP to input any alphabet and check whether it is vowel or    consonant.*/
import java.util.*;
class Vowel
  {
    public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the character ");
      ch=sc.next().charAt(0);
      if((ch=='a'|| ch=='e' || ch=='i' ||ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'))
      {
        System.out.println("the vowels are ");
      }
      else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
    {
      System.out.println(ch+ " is an Alphabet ");
    } 
   else
    System.out.println(ch+ " is not an Alphabet ");
    }
  }
  