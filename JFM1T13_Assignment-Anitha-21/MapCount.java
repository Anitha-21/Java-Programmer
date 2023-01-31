/*  JFM1T13_Assignment3:

      Write a Java program to count the number of key-value (size) mappings in a map. 
      Prompt the user input from the terminal.

      Sample Input: 
      Enter value:20
      Enter key:bitLabs
      Enter another student (y/n)?y
      Enter value:25
      Enter key:welcomes
      Enter another student (y/n)?y
      Enter value:30 
      Enter key:you
      Enter another student (y/n)?n

      Expected Output: The size of the map is 3
*/
import java.util.*;
public class MapCount 
{
   public static void main(String args[])
    {
      char ch;
      Scanner sc=new Scanner(System.in);
  HashMap<Integer,String> hm=new HashMap<Integer,String>();
    do
     {
      System.out.println("enter the value");
      int key=sc.nextInt();
      System.out.println("enter the key");
      String value=sc.next();
      hm.put(key,value);
     System.out.println("Enter another student (y/n)? ");
      ch=sc.next().charAt(0);
     }
      while(ch=='y');
     System.out.println(hm.size());
    }
}


//main method

//declare HashMap object

//create a while loop for user not enter no

//ask for user input for value and key

//add the user inputs to the HashMap

//ask user if they want to enter another

//condition to satisfy in order to loop again

//print total size as result
