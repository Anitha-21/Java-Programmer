class person  //person is a parent class
  {
   String name;
    int age;
  }
class Student extends person  //Student is child class
  {
    int rollno;
    public void display()
    {
      System.out.println(name+"  "+age+"  "+rollno);
    }
    public static void main(String args[])
    {
      Student obj=new Student();
      obj.name="Anitha";
      obj.rollno=102;
      obj.age=24;
      obj.display();   
    }
  }