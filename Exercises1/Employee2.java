
import java.util.*;
class Employee2
  {
    String sname;
    int id;
    String address;
   
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Employee2 num[]=new Employee2[4];
      for(int i=0;i<4;i++)
        {
          num[i]=new Employee2();
         System.out.println("enter student name");
          num[i].sname=sc.next();
          System.out.println("enter student rollno");
          num[i].id=sc.nextInt();
          System.out.println("enter student address");
          num[i].address=sc.next();
        }
      System.out.println("the student details are");
      for(int i=0;i<4;i++)
        {
       System.out.println(num[i].sname+" "+num[i].id+" "+num[i].address);
        }
    }
  }