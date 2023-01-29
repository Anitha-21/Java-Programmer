// WAP to input week number and print week day.
import java.util.*;
class Day
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("the week and day are(1-7) ");
      int week=sc.nextInt();
      if(week==1)
      {
      System.out.println("monday");
      }
      else if(week==2)
      {
       System.out.println("tuesday");
      }
      else if(week==3)
      {
      System.out.println("wednesday");
      }
      else if(week==4)
      {
      System.out.println("thursday");
      }
      else if(week==5)
      {
      System.out.println("friday");
      }
      else if(week==6)
      {
    System.out.println("saturday");
      }
      else if(week==7)
      {
    System.out.println("sunday");
      }
      else
      System.out.println("no week and day (1-7 ");
    }
  }
