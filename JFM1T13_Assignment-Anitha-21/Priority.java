/* JFM1T13_Assignment1

     Write a program to create a priority queue, add some colors (string) and print out the elements of the priority queue. 
     Prompt the user input from the terminal.
     
     Sample Input: 
     Enter how many colors you want: 
     5
     Enter Colors: 
     red
     white
     green
     orange
     black
     
     Expected Output:
     Elements of the Priority Queue:  black, green, orange, red, white 
*/

import java.util.*;

public class Priority 
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size");
    int n=sc.nextInt();
    System.out.println("Enter the elements");
    PriorityQueue<String> pq=new PriorityQueue<String>();
    for(int i=0;i<n;i++)
      {
        pq.add(sc.next());
      }
  System.out.println("Elements of the Priority Queue: "+pq);
  }
}

//maiin method

//creat Scanner object

//initialize priority queue object

//take input from user and add that values to the priority queue object

//print result using poll method
