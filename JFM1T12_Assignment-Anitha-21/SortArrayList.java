/*  JFM1T12_Assignment2:

    Write a program to sort a given arraylist of integers in ascending order.   
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter how many numbers you want: 
    5
    Enter Number 0
    467
    Enter Number 1
    342
    Enter Number 2
    167
    Enter Number 3
    511
    Enter Number 4
    204
    
    Expected Output:
    ArrayList After Sorting:
    167
    204
    342
    467
    511

*/     

import java.util.*;  

public class SortArrayList  
 {  
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size");
     int n=sc.nextInt();
     System.out.println("Enter the elements");
     ArrayList<Integer> al=new ArrayList<Integer>();
     for(int i=0;i<n;i++)
       {
         al.add(sc.nextInt());
       }
     System.out.println("Before sort: "+al);
      Collections.sort(al);
     System.out.println("After sort: "+al);
   }
 }

//main method

//declare variables

//create Scanner object

//take input from user

//create an object of ArrayList class

//sort ArrayList in ascending oeder

//print Array list
