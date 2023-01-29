/*write a program java read from user the week and day using- using switch */
import java.util.*;
 class Ctest {
 public static void main(String args[])
  {
    //int num;
    char ch;
   Scanner sc=new Scanner(System.in);
   System.out.println("the week and day (1-7) ");
   //num=sc.nextInt();
    ch=sc.next().charAt(0);
   switch(ch)
     {
     case 'a':
     System.out.println("monday");
     break;
     case 'b':
     System.out.println("tuesday");
     break;
     case 'c':
     System.out.println("wednesday");
     break;
     case 'd':
     System.out.println("thursday");
     break;
     case 'e':
     System.out.println("friday");
     break;
     case 'f':
     System.out.println("saturday");
     break;
     case 'g':
     System.out.println("sunday");
     break;
     default:
     System.out.println("invalid day and week ");
     }  
  }
}
 /*Syntax for switch
  switch
  {
  case value1
    statement();
  break;
  case value2
    statement();
  break;
  default;
    statement();
  }*/