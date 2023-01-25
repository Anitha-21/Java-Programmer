//Write a program to print the percentage of student
import java.util.*;
class Marks
  {
   public static void main(String args[])
    {
      int percentage;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the percentage ");
      percentage=sc.nextInt();
      if(percentage>=80 && percentage<=100)
      {
        System.out.println("the grade is A+ ");
      }
      else if(percentage>70 && percentage<80)
      {
        System.out.println("the grade is A ");
      }
      else if(percentage>60 && percentage<=70)
      {
        System.out.println("the grade is B ");
      }
      else if(percentage>45 && percentage<=60)
      {
        System.out.println("the grade is C ");
      }
      else
      {
        System.out.println("Failed");
      }
    }
    
  }