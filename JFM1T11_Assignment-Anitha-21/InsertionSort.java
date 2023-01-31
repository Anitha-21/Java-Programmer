/* JFM1T11_Assignment3:

   Have you ever arranged the deck of cards, or maybe shirts in your cupboard? What is common between those two things? 
   Well, you put the next card or shirt into their proper position, or we can say you insert the next element in its 
   proper position. Write a program to sort an unsorted array of numbers in the same manner.
   Prompt the user input from the terminal.

   SampleInput: 6,5,4,3,2,1
   
   Expected Output: 1,2,3,4,5,6

*/

import java.util.*;

public class InsertionSort 
{
  static void insert(int arr[])
    {
      int i,j,key;
      for(i=1;i<arr.length;i++)
       {
        key=arr[i];
        j=i-1;
        while(j>=0 && key<=arr[j])
        {
          arr[j+1]=arr[j];
          j=j-1;
        }
         arr[j+1]=key;       
        }
    }
    public static void main(String args[])
    {
      int arr[]={6,5,4,3,2,1};
      System.out.println("Elements before sorting:");
      for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+" ");
      System.out.println();
      insert(arr);
      System.out.println("Elements after sorting:");
      for(int i=0;i<arr.length;i++)
        {
       System.out.print(arr[i]+" ");
        }
    }
  }
//main method

//take input from user

//create integer array for all elements

//call sort method

//print sorted array

//create sort method

//declare variables

// storing current element whose left side is checked for its correct position 

//check whether the adjacent element in left side is greater or less than the current element.

// move the left side element to one position forward.

 // move current element to its  correct position.
