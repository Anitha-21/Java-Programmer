//write a program to do while loop
//import java.util.*;
class Do_While
  {
    public static void main(String arg[])
    {
      char ch='A';
     /* Scanner sc=new Scanner(System.in);
      System.out.println("the characters ");
      ch=sc.next().charAt(0);*/
      
      do
        {
        System.out.print(ch+" ");
        ch++;
        }
      while(ch<='Z');
    }
  }