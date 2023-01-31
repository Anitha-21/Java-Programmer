/* JFM1T11_Assignment6:

   Write a program to sort an array containing alphabets, special symbols and numbers.
   Prompt the user input from the terminal.
   
   Sample Input: bit01$$Lab02s03!@!!
   
   Expected Output: 
   Characters: bitLabs
   Numbers: 010203
   Special characters: $$!@!!

*/

import java.util.Scanner;
public class Spliting  
{ 
   public static void main(String args[])  
    {   
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string to Split");
        String str=sc.next();
      StringBuffer alpha=new StringBuffer(),digit=new StringBuffer(),special =new StringBuffer();  
      for (int i=0; i<str.length(); i++)  
           {  
            if (Character.isDigit(str.charAt(i)))  
                digit.append(str.charAt(i));  
else if(Character.isAlphabetic(str.charAt(i)))  
                alpha.append(str.charAt(i));  
else  
      special.append(str.charAt(i));  
        }  
System.out.println("The Alphabates are: "+alpha);  
System.out.println("The Numbers are: "+digit);  
System.out.println("The Special Characters are: "+special);
    }
}


//main method

//take input from user

//call splitString method

//create splitString method in that initialize alpha, num and special to stringBuffer

//check if the entered string is digit,alpha and special using if condition

//printing seperatly characters in character, numbers in number and special characters in special character
