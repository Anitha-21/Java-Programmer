/*   JFM1T12_Assignment3:

     Write a program to copy one arraylist into another.
     Prompt the user input from the terminal.
     
     Sample Input:
     Enter how many numbers you want: 
     5
     Enter Number 0
     5
     Enter Number 1
     4
     Enter Number 2
     3
     Enter Number 3
     2
     Enter Number 4
    
    Expected Output:
    -----Iterating over the second ArrayList----
     5
     4
     3
     2
     1

*/

import java.util.*; 
import java.util.ArrayList; 

class CopyArrayList  
{ 
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=sc.nextInt();
    System.out.println("Enter the elements");
    ArrayList<Integer> arr=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
      {
        arr.add(sc.nextInt());
      }
    System.out.println(arr);
    ArrayList<Integer> arr2=new ArrayList<Integer>();
    for(Integer value:arr)
      {
         arr2.add(value);
      }
     System.out.println("Iterating over the second ArrayList");
    for (Integer value : arr2) 
    {
      System.out.println(value);
    }
  }

//main method

//declare variables

//create Scanner object

//take input from user

// Assign the first reference to second

// Iterat over second ArrayList and print

}