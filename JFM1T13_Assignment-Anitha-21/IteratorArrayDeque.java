/* JFM1T13_Assignment2:

     Write a program to iterate through all elements in an ArrayDeque.Using iterator method
     Prompt the user input from the terminal.
     
     Sample Input: 12,31,6,23,90

     Expected Output:  
     ArrayDeque: [12, 31, 6, 23, 90]
     The iterator values are: 
     12
     31
     6
     23
     90
*/

import java.util.*;
public class IteratorArrayDeque 
{
  public static void main(String args[])
  {
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the size");
  int n=sc.nextInt();
 System.out.println("Enter the elements");
  ArrayDeque<Integer> ad=new ArrayDeque<Integer>();
 for(int i=0;i<n;i++)
   {
     ad.add(sc.nextInt());
   }
 System.out.println("ArrayDeque: "+ad);
    ArrayDeque<Integer> ad1=new ArrayDeque<Integer>();
    for(Integer value:ad)
      {
         ad1.add(value);
      }
     System.out.println("The iterator values are: ");
    for (Integer value : ad1) 
    {
      System.out.println(value);
    }
  }
}


//create Scanner object

//create an empty ArrayDeque

//take input from user

//create an iterator

//Display the values after iterating through the Deque 
