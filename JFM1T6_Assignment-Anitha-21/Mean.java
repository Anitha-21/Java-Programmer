/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/
import java.util.Scanner;
public class Mean
      {
  public static double sum(double num1,double num2,double num3)
    {
      double num4=(num1+num2+num3)/3;
      return num4;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter num1,num2 and num3 values");
      double num1=sc.nextDouble();
      double num2=sc.nextDouble();
      double num3=sc.nextDouble();
      double result=sum(num1,num2,num3);      
  System.out.println("The mean of Three numbers is :"+result);
    }
}
//main method

//declare variables and initialize sum=0

//create scanner object

//take input from user

//check the for loop for number of values entered in input

//calculate mean

//print result
