//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage {
  public static void main(String args[]) {
    float percentage;
    float total_marks;
    float score;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your marks :");
    score = sc.nextFloat();
    System.out.println("Enter your marks :");
    total_marks = sc.nextFloat();
    percentage = (float)((score/ total_marks)*100);
    System.out.println("total marks of the subjects percentage are : "+ percentage);
  }
}
//Define the main method

//Declare the variables

//Use the scanner class to provide total_marks and maximum_marks at execution time
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the total marks");
total_marks= scanner.nextInt();
System.out.println("Enter maximum marks possible "); 
maximum_marks=scanner.nextInt(); 
*/


//Calculate the percentage of marks

//Print the Result

