/* JFM1T7_Assignment3:

   Accept an integer number as input from the console and when the program is executed print the binary, octal and hexadecimal equivalent of the given number.
   Prompt the user for the  values to be input from the terminal
   Hint: Refer Java Documentation and look for the appropriate Wrapper class method

   Sample Input: 20
   
   Expected Output: Binary equivalent: 10100 Octal equivalent: 24 Hexadecimal equivalent: 14
   
*/
import java.util.*;
public class EquivalentNumbers 
{
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
  System.out.println("enter the number");
  int num =sc.nextInt();
  String bin = Integer.toBinaryString(num);  
  System.out.println("Binary:- "+bin);
  String hex = Integer.toHexString(num);
  System.out.println("Hexa decimal:- "+hex);
  String oct = Integer.toOctalString(num);
  System.out.println("Octal:- "+oct);
  }
}
//Main method

//initialize Convert class constructor

//create Scanner object

//take input from user

//convert numbers into hexa,octal and binary

//print result
     
//}

//create Convert class in that declare variables

//add getters and setters method


//Good
