//Check two strings are anagram or not

import java.util.Arrays;//In use of Arrays
import java.util.*;
class SortingString
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter first string");
      String s1=sc.next();
      System.out.println("enter second string");
      String s2=sc.next();
      if(s1.length()!=s2.length())
      {
        System.out.println("the both strings are not anagram");
      }
      else
      {
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String str1=new String(ch1);
        String str2=new String(ch2);
        if(str1.equals(str2))
        {
          System.out.println("given strings are anagram");
        }
        else
          System.out.println("given strings are not  anagram");
      }
    }
  }
