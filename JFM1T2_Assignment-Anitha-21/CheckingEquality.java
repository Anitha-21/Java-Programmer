/*  JFM1T2_AssignmentPrograms2:

    Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
    1. 30 and 20
    2. 20 and 20
    3. 20 and 30
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    30
    Enter second number: 
    20
    
    Expected Output:
    30 and 20 is not equal
     
*/

//import statements for java program to read inputs using Scanner class
import java.util.*;

public class CheckingEquality {
  public static void main(String args[])
  {
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a and b value: ");
    a=sc.nextInt();
    b=sc.nextInt();   
    System.out.println(a==b);
    System.out.println(a!=b);
   /* System.out.println("the two numbers are not equal are "+(a==b));
    System.out.println("the two numbers are equal: "+(a!=b)); */
    System.out.println("The a and b values are not equal ");
  }
}
//main method

/*Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//check if the two numbers are equal or not

//If the two numbers are equal then print both are equal else print both are not equal

