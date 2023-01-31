/* JFM1T7_Assignment2:

   Create a Student Result Processing System for 3 students.  
   Sample inputs: Console input roll numbers, names and 5 subject marks for each student
   
   Sample output: Display roll numbers, names and percentage obtained by all 3 students in the following format:
   Roll Number: 1
   Name: Shree Balaji
   Percentage: 99%

*/
import java.util.*;
public class StudentResult 
{
  public static void main(String args[])
  {      
    Scanner in = new Scanner(System.in);
      System.out.print("Enter number of students: ");
        int n = in.nextInt();        
        int rollNo[] = new int[n];
        String name[] = new String[n];
        int s1[] = new int[n];
        int s2[] = new int[n];
        int s3[] = new int[n];
        int s4[] = new int[n];
        int s5[] = new int[n];
        double avg[] = new double[n];        
        for (int i = 0; i < n; i++) {
 System.out.println("Enter student " + (i+1) + " details:");
            System.out.print("Roll No: ");
            rollNo[i] = in.nextInt();
            in.nextLine();
            System.out.print("Name: ");
            name[i] = in.nextLine();
            System.out.print("Subject 1 Marks: ");
            s1[i] = in.nextInt();
            System.out.print("Subject 2 Marks: ");
            s2[i] = in.nextInt();
            System.out.print("Subject 3 Marks: ");
            s3[i] = in.nextInt();
           System.out.print("Subject 4 Marks: ");
            s4[i] = in.nextInt();
          System.out.print("Subject 5 Marks: ");
          s5[i] = in.nextInt();
            avg[i] = (s1[i] + s2[i] + s3[i] + s4[i] + s5[i]) / 5.0;
        }        
        System.out.println("Roll No and Name and Remark");
        for (int i = 0; i < n; i++) {
            String remark;
            if (avg[i] < 40) 
                remark = "Poor";
            else if (avg[i] < 60)
                remark = "Pass";
            else if (avg[i] < 75)
                remark = "Good";
            else if (avg[i] < 85)
                remark = "First Class";
            else
                remark = "Excellent";
 System.out.println(rollNo[i]+" "+name[i]+ "  "+ remark);
        }
    }
}

//main method

//initialize student constructor 3 times with different names

//Create an array and add the 3 student to it

//create displayPercentage static method in that add a for loop for student array

//calculate percentage

//display student details

//create getStudentInput method in that create a Scanner object and take input from user

//print 5 subject marks using for loop
     
  //}

//create Student class 
//class Student {

//declare and initialize variables

//add getters and setters method
//}
//}


//Good
