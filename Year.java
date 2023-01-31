//WAP to check whether a year is leap year or not
import java.util.*;
class Year
  {
    public static void main(String args[])
    {
      int year;
      Scanner sc=new Scanner(System.in);
      System.out.println("the leap year is ");
      year=sc.nextInt();
      if((year%4==0 && year%100!=0) || (year%400==0))          {
        System.out.println("this is leap year");
      }
      else 
        System.out.println("this is not a leap year");
      

    }
  }