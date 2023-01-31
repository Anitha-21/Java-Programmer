/* JFM1T11_Assignment2:

   Write a program to execute the search of a number in a sorted array following the below logic: 
   If the target element is greater than middle element then you go to the middle of the right of the remaining numbers 
   or otherwise towards middle of the left of the remaining numbers. 
   Continue until the number is either found or not found.
   Prompt the user input from the terminal.
   
   Sample Input: 2,5,10,12,15,20,25,31,40
   Enter number to search x= 20

   Expected Output: Position of element is : 6
   
   Enter number to search x= 26
   Expected Output: Sorry,Key doesn't exist in the array
   
*/

import java.util.Scanner;

public class BinarySearch 
{
      public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
  System.out.println("enter the Size of an Array");
int n=sc.nextInt();
int beg=0,end=n-1,mid=((beg+end)/2);
int arr[]=new int[n];
System.out.println("enter the elements in the Array");
    for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("enter the element to Search");
    int num=sc.nextInt();
    int last=n-1;
       mid = (beg + last)/2;  
   while( beg <= last ){  
      if ( arr[mid] < num ){  
        beg = mid + 1;     
      }
      else if ( arr[mid]==num )
      {  
        System.out.println(num+" is found at index: " + mid); break;  
      }
      else
      {  
         last =mid-1;  
      }  
      mid = (beg + last)/2;  
   }  
   if (beg >last)
   {  
      System.out.println("Sorry,"+num+" doesn't exist in the array");
   }
  }
}



//main method 

//Declare variables

//take input from user

//call binarySearch method


//create a method in that declare a variables and initialize l=a.length, beg=0, end=l-1, mid=(beg+end)/2

//check each number less than or greater than to the mid element

//if mid element is less than key than it calculates beg and mid

//if mid is equal to key than it stops and return mid

//if mid element is greater than key then it calculates end and mid

//checking beg is greater than end, then mid = 0

