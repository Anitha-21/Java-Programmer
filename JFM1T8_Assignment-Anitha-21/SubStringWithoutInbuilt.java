/*  JFM1T8_Assignment3:

    Write a program to find a substring in a string without using an inbuilt method of String class.
    Prompt the user input from the terminal.
    
    Sample input: Learning made easy at bitLabs
    Enter search string: bitLabs
    
    Expected output: bitLabs is found
    
    Enter search string: bitlab
    Expected output: bitlab is not found

*/

import java.util.Scanner;
public class SubStringWithoutInbuilt 
{ 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s=sc.nextLine();
        System.out.println("Enter search string : ");
        String s1=sc.nextLine();
        boolean result = s.contains(s1);
        if (result)
        {
           System.out.println(s1+" is present");
        }
        else
          System.out.println(s1+" is not present");
    }
}


//main method

//declare variables

//take input from user

//compare two strings if the search string found or not without using inbuilt method isSubString()

//creat isSubString method in that declare variable 

//check two strings if the search string is present then return true else return false


//Kindly check your logic

//you should not use any inbuilt method but you used indexOf() method
