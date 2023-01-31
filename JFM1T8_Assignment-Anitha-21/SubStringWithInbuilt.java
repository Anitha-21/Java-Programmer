/*  JFM1T8_Assignment2:

    Write a program to find a substring in a string using an inbuilt method of String class.
    Prompt the user input from the terminal.
  
    Sample input: Learning made easy at bitLabs
    Enter search string : Learning made easy at bitLabs
  
    Expected output: bitLabs is found
  
    Enter search string: bitlab
    Expected output: bitlab is not found
*/

import java.util.*;

public class SubStringWithInbuilt 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    String txt =sc.nextLine();
    String str1 = sc.nextLine();
    boolean result = txt.contains(str1);
    if(result) 
    {
    System.out.println("yes");
    }
    else 
    {
    System.out.println("no");
    } 
  }
}

//main method

//declare variables

//take input from user

//check if the string contains substring or not if contains print found else print not found

//Good
