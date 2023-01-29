/*WAP to print all alphabets from a to z. - using while loop*/
import java.util.*;
class Alpha
  {
    public static void main(String args[])
    {
       char ch='a';
      Scanner sc=new Scanner(System.in);
      System.out.println("the alphabets a-z are ");
      while(ch<='z')
        {
          System.out.print(ch+" ");
          ch++;
        }
    }
  }