/*  JFM1T2_Assignment1:

     Write a program to perform the below actions and print the result.
     1. Difference of 2 numbers (30 and 10)
     2. Product of 2 numbers (45 and 2)
     3. Division of 2 numbers (600 and 10)
     4. Increment and Decrement the number (15)
     5. Remainder of 2 numbers (14 and 5)
     Prompt the user input from the terminal.
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public class Operations {
  public static void main(String args[])
  {
    int a,b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the a and b are: ");
    a = sc.nextInt();
    b = sc.nextInt();
    int diff = (a-b);
     System.out.println("The difference of two numbers are: "+diff);
     a = sc.nextInt();
    b = sc.nextInt();
    int prod = a*b;
     System.out.println("The product if two number are: "+prod);
    a = sc.nextInt();
    b = sc.nextInt();
    int div = a/b;
     System.out.println("The division of two numbers are: " +div);
    a = sc.nextInt();
    b = sc.nextInt();
    int incre=a++;
    System.out.println("The increment and decrement number are: "+incre);
    a = sc.nextInt();
    b = sc.nextInt();
    int decre = --b;
    System.out.println("The decrement of number is: "+decre);
    a = sc.nextInt();
    b = sc.nextInt();
    int rem = a%b;
    System.out.println("The remainder of two numbers are: "+rem);
  }
}
    

//main method

/*
  Use the scanner class to provide input at execution time using scanner object
  Scanner sc=new Scanner(System.in);
*/

/*
  Take input from user
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
*/

//calculate difference,product,division,increment and remainder 

//print appropriate result for all operations

