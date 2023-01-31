/* JFM1T6_Assignment1:

   Write an Employee class with any 3 properties and create 2 employee objects to store and display the data.
   Prompt the user for the 2 employees to be input from the terminal.

   Sample Input:
   Enter the Empid: 01
   Enter the Name: Sree
   Enter Salary: 1000
   Enter the Empid: 02
   Enter the Name: Balaji
   Enter Salary: 2000

   Expected Output:
   **** Stored data displayed below ****
   Employee id = 01
   Employee name = Sree
   Employee salary = 1000
   Employee id = 02
   Employee name = Balaji
   Employee salary = 2000

*/
import java.util.*;
class Employee
  {
   int id;
     String sname;
    long salary;
     public void insert(String nam,int num,long lang)
    {
    id=num;
    sname=nam;
    salary=lang;
    } 
    public void display()
  {
  System.out.println(id+" "+sname+" "+salary);
  }   
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the employees");
      int n=sc.nextInt();
      Employee num[]=new Employee[n];
      for(int i=0;i<n;i++)
        {
          num[i]=new Employee();
         System.out.println("enter emp name");
          num[i].sname=sc.next();
          System.out.println("enter emp rollno");
          num[i].id=sc.nextInt();
          System.out.println("enter salary");
          num[i].salary=sc.nextLong();
          num[i].display();
        }
      System.out.println("the employee details are");
      for(int i=0;i<n;i++)
        {
       System.out.println("Employee id = "+num[i].id);
      System.out.println("Employee name = "+num[i].sname);
      System.out.println("Employee salary ="+num[i].salary);  
        }
    }
  }
//Declare the variables

//Create a method getInput() 

//public  void getInput(){

//create Scanner object

//take input from user

//}

//create display method
//public void display(){

//Print Employee details

//}

//Create a Employee constructor with the two employees

//check for loop to print two employee details

//}


//Good
