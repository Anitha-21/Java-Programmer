/* WAP to count occurrences of a character in given string. */
import java.util.*;
class OccuranceString
  {
    public static void main(String args[])
    {
       int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string to search for all occurances");
      String s=sc.nextLine();
      System.out.println("enter the character to search");
      char ch=sc.next().charAt(0);
      for(int i=0;i<s.length();i++)
        {
          if(ch==s.charAt(i))
          {
            System.out.println("Given character "+ch+" is at position: "+i);
            count++;
          }
          }
      System.out.println("count of the character is :"+count);
     
    }
  }