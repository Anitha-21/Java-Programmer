//JFM1T3_Assignment1: 
/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 

  Sample Input:
    radius of the circle=6

  Expected Output:
   Circumference of the circle=38
   

*/ 

//import statement for java program to read inputs using Scanner class 
import java.util.*;
import java.lang.Math;

public class Circle { 
  public static void main(String args[])
  {
    int r;
    float c,pi=3.14f;
    Scanner sc=new Scanner(System.in);
    System.out.println("The radius of circle is: ");
    r=sc.nextInt();
    c = (3.14f*(r*2));
    System.out.println("The circumference of the circle is: "+c);
  }

//Define main method

//Declare the variables
//int radius;


//Use the scanner class to provide radius at execution time

/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter radius as a positive integer");
radius= scanner.nextInt();
*/

//Caluculate the circumference of the circle

//Casting the floating-point value to int  

//Print the Result

} 