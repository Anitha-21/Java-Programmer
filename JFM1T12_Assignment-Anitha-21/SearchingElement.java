/*  JFM1T12_Assignment1:

    Write a program to search an element in an arraylist.  
    Prompt the user input from the terminal.
    
    Sample Input 1:
    Enter how many Elements you want: 
    5
    Enter Elements: 
    Red
    Green
    Orange
    White
    Black
    
    Enter Search Element: 
    Red
    
    Expected Output:
    Red Element is present

    Sample Input 2: 
    Enter Search Element: 
    yellow
    
    Expected Output:
    yellow Element is not present

*/

import java.util.Scanner;
import java.util.ArrayList; 

class SearchingElement 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=sc.nextInt();
    ArrayList<String> al=new ArrayList<String>();
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
      {
        al.add(sc.next());
      } 
    System.out.println("Enter element to search");
    String lh=sc.next();
    if(al.contains(lh))
    {
      System.out.println("Element is found");
    }
    else
      System.out.println("Element is not found");
  }
}

//main method

//declare variables

//create scanner object

//take input from user

//creat an object of LinkedHashSet class 

//check if the search element is present on the list using contains method

//If element found then print element is present else then print element not present