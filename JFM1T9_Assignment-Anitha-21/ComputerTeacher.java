/* JFM1T9_Assignment3:
     Create a base class Teacher and a sub class ComputerTeacher.
     class ComputerTeacher extends the designation and collegename properties and work() method from base Teacher class,
     you need not declare these properties and method in ComputerTeacher sub class .
     Try accessing these properties using child class object in Main method.
  
     Sample Output:
     Designation       CollegeName
     ComputerTeacher      IIT
*/


class Teacher 
{
   String Designation="ComputerTeacher";
   String CollegeName="IIT";
   void work()
     {
         System.out.println("Designation    CollegeName");
         System.out.println(Designation + " "+CollegeName);
     }
}
class Languages extends Teacher
{
  void display()
  {
    work();
  }
}
class ComputerTeacher 
     {
    public static void main(String args[])
     {
      Languages Tech =new Languages();
      Tech.display();
     }
     }
