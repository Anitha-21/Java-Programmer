/* JFM1T11_Assignment4 :

   Write a program to sort an array of numbers in ascending order by comparing each number with every other number in 
   an array so that after each pass/iteration the smallest element reaches at it’s correct position. 

   Prompt the user input from the terminal.
   
   Sample Input: 4,6,3,9,10
   
   Expected Output: 10,9,6,4,3

 */

import java.util.Scanner;

public class AscendingOrder 
{
  public static void main(String args[])
  {
    int j,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an Array");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the Elements of an Array");
    for(i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
    for(i=0;i<n;i++)
    {
      for (j=i;j<n;j++)
       {
         int temp=0;
         if(arr[i]>arr[j])
         {
                temp = arr[i];           
                arr[i] = arr[j];            
                arr[j] = temp;
          }
        }
    
      }
    System.out.println("The Ascsending order is: ");
          for (i=0;i<n;i++)
            {
            System.out.print(arr[i]+",");
            }
  }
}

//main method

//take input from user

//check input element numbers and printing all numbers using for loop

//check all elements using for loop

//check if first number is greater than the second number or not if true then swap

//check and print result

