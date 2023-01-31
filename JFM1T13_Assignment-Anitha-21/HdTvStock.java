/*  JFM1T13_Assignment4: 

      Write a program to create a class HDTV with the properties: 
         •	Brandname 
         •	Size 
      Create another class having an ArrayList and add 3 objects of HDTV into it. Display HDTV objects in sorted order of size.(Use Comparator) 

     Sample Output:
     4000 Sony 20
     2000 LG 26
     3000 MI 27
     1000 Samsung 28
*/
//sorting done by using comparator Interface 
import java.util.*;
class Student
  {
    int rollno;
  String name;
  int age;
  Student(int rollno,String name,int age)
    {
      this.rollno=rollno;
      this.name=name;
      this.age=age;
    }
  }
class AgeComparator implements Comparator<Student>
    {
    public int compare(Student st1,Student st2)
      {
        if(st1.age==st2.age)
          return 0;
        else if(st1.age>st2.age)
          return 1;
        else
          return -1;
      }
    }class NameComparator implements Comparator<Student>
    {
      public int compare(Student st1,Student st2)
      {
        return st1.name.compareTo(st2.name);
      }
    }
public class HdTvStock
  {
    public static void main(String args[])
    {
      Student s1=new Student( 4000, "Sony", 20);
      Student s2=new Student(2000, "LG", 26);
      Student s3=new Student( 3000, "MI", 27);
      Student s4=new Student(1000, "Samsung", 28);
      ArrayList<Student> al=new ArrayList<Student>();
      al.add(s1);
      al.add(s2);
      al.add(s3);
      al.add(s4);
      System.out.println("sort by student age");
      AgeComparator ac=new AgeComparator();
      Collections.sort(al,ac);
      for(Student st:al)
        {
          System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
     System.out.println("sort by student name");
      NameComparator nc=new NameComparator();
      Collections.sort(al,nc);
      for(Student st:al)
        {
      System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
  }
//main method

//create HdTv class object in arraylist

//add elements to that arraylist

//print values on sorted order based on size value

//use collection.sort and pass Brandname Comparator as parameters

//print result

//create HdTv class in that declare variables and pass variables as parameters


//create BrandnameComparator it implements Comparator in that create a compare method pass two parameters for comparing sizes

//access HdTv class objects

//compare sizes and return size
