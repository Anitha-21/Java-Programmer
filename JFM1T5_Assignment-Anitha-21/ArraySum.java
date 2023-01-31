/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
public class ArraySum {
  public static void main(String args[])
  {
    int a[]={1,2,3,4,5,6,7,8,9,10};
    int sum=0;
	      System.out.println("Enter elements of an array: ");
	    for(int i=0;i<10;i++)
	       {
	  System.out.println("the elements are "+a[i]);
	       }
	     for(int i=0;i<10;i++)
	        {
	           sum=sum+a[i];
	        }
	System.out.println("the sum of the numbers are "+sum);
        }
  }

//Define the main method

//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result


