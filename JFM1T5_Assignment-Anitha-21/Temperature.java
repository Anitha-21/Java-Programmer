/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/

import java.util.*;

public class Temperature 
{
  public static void main(String args[]) 
  {
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("the size is");
    n=sc.nextInt();
    System.out.println("enter the day");
    int sum[]=new int[n];
    for(int i=0;i<sum.length;i++)
      {
        sum[i]=sc.nextInt();
      }
    int min=sum[0];
    for(int i=1;i<sum.length;i++)
      {  
        if(sum[i]<min)
        {
         min=sum[i];
        }
      }
     System.out.println("the lowest temperature is of the week is "+min);
  }
}

// Define the main method

// Declare the variables and initialize

// Take temperature of 7 days as a input from user

// Calculate the lowest temperature

// Print the result
