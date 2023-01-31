// using super keyword in instance and method variable
class parent
  {
    String name="Mahesh";
    int rollno=102;
    public void display()
    {
      System.out.println("Hello bitlabs");
    }
  }
class child extends parent
  {
    String name="Anitha";
    int rollno=103;
    int age=22;
    public void display()
    {
      System.out.println(name);
      System.out.println(rollno);
      System.out.println(age);
      System.out.println(super.name);
      System.out.println(super.rollno);
      super.display();
    }
  }
class SuperKeyword
{
  public static void main(String args[])
  {
    child obj=new child();
    obj.display();
  }
}