/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.*;

public class PrimeNumbers
  {
   public static void main(String args[])
    {
      int i,num1,num2,count=0,temp=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("the starting numbers are ");
      num1=sc.nextInt();
      System.out.println("enter the num2 number ");
      num2=sc.nextInt();
      if (num1 > num2) {
      temp = num2;
      num1 = num2;
      num2 = temp;
   }
   while (num1 < num2) {
      count = 0;
      if (num1 <= 1) {
         ++num1;
         continue;
      }

      for (i = 2; i <= num1 / 2; ++i) {
         if (num1% i == 0) {
            count = 1;
            break;
         }
      }
      if (count == 0)
         System.out.println("the prime numbers are " +num1);
      ++num1;

          }
       }
   }
//Add main method here

//Declare variables num1, num2, i, count and initialize count as zero

//Use the scanner class to provide input at execution time using scanner object
//Scanner s= new Scanner(System.in);

/*
Take start value as input and read using scanner object
System.out.print("Enter Starting Number : ");
int start = sc.nextInt();
*/

//Take end value as an input and read using scanner object

//check for all the integer numbers which is between the two numbers given, using for loop

/*Inside the loop, check if the number can be divided by other numbers. You will need another loop for this.
  If it is divisble by other numbers (except 1 and itself), then move on to check the next number
  Else, print the prime number and then move on to the next number
*/
 
     
