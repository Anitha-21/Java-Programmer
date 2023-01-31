// WAP to print day of week name using switch case.
import java.util.*;
class Case
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("the week and day");
      num=sc.nextInt();
      switch(num)
      {
        case 1:
        System.out.println("the day is monday");
      break;
        case 2:      
        System.out.println("the day is tuesday");
        break;
        case 3:      
        System.out.println("the day is wednesday");
        break;            
        case 4:
        System.out.println("the day is thursday");
        break;
        case 5:
        System.out.println("the day is friday");
        break;
        case 6:
        System.out.println("the day is saturday");
        break;
        case 7:
        System.out.println("the day is sunday ");
        break;
        default:
      System.out.println("invalid day");
      }
    }
  }