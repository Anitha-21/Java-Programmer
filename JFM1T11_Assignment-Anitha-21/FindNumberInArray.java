/* JFM1T11_Assignment1:

   Write a program to find a number in an integer array. If found print the number and the array index at which it is found. 
   Prompt the user input from the terminal.
   
   Sample Input: 2,4,6,1,7,8,9
   Enter number to search x= 9

   Expected Output: 9 found at index 6
   
   Enter number to search x= 12
   Expected Output: Sorry! 12 is not found in array.
   
*/

import java.util.Scanner;

public class FindNumberInArray 
{
  public static void main(String args[])
  {
   int n;          
    Scanner sc=new Scanner(System.in);
  System.out.print("Enter total number of elements: ");
  n=sc.nextInt();
  int arr[]=new int[n];
  System.out.println("Enter array elements:");
    for(int i=0; i<n; i++)
    {
     System.out.print("Enter element (" + (i+1) +"): ");
       arr[i]=sc.nextInt();
    }
      int num;
       System.out.print("Enter number to search: ");
       num=sc.nextInt();
        int index=-1;       
       for(int i=0;i<n;i++)
       {
         if(arr[i]==num)
         {
          index=i;
         break;
        }
     }
      if(index==-1)
      {
   System.out.println("Sorry! " + num + " is not found in array.");
    }
    else
      {
    System.out.println(num + " found at index " + index);
      }
  }
}

//main method

//declaring variables

//creating Scanner object

//take input from user

//find number in array

//search the element if found print that position else print not found message
