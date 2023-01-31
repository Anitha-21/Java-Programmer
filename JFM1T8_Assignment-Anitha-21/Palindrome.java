/*  JFM1T8_Assignment4:

    Write a program to check whether a string is a Palindrome.
    Prompt the user input from the terminal.
    
    Sample input: Malayalam
    
    Expected output: Malayalam is a Palindrome
*/

import java.util.*;

public class Palindrome {
  public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.print("the original string is : ");
     String num=sc.nextLine();
     String temp="";        
      System.out.println("the temp word ");
      for (int i=0; i<num.length(); i++)
      {
        temp= num.charAt(i)+temp;
      }
      System.out.println("Reversed word: "+ temp);
     if(num.equals(temp))
      {
       System.out.println("the given word is a palindrome ");
      }
        else      
  System.out.println("the given word is not a palindrome ");  
    }
}

// main method

// declare varible

// take input from user

/*
 * divide the whole string into two halves and compare each character in the
 * first half with each character in the second half in reverse. If both are
 * equal then it is a palindrome else print it is not a palindrome
 */

//Good
