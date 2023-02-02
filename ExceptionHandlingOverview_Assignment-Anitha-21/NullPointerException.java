/*4. Write a program which will illustrate NullPointerException. Create student class along with name, marks and city and add setter methods and getter methods.
  Create a method which can take student class as a parameter and print name, marks and city in method business logic.
  Write your comments regarding NullPointerException such "When NullPointerException will occur in program?"
*/
public class NullPointerException 
{
  public static void main(String args[]) 
  {
Student obj=new Student();
      obj.setMarks(600);
      obj.setCity("Hyderabad");
      obj.display();
      System.out.println(obj.getName().length());
    }
}
class Student
  {
   private String name;
   private int marks;
   private String city;
    void setName(String n)
    {
      name=n;
    }
    void setMarks(int m)
    {
      marks=m;
    }
    void setCity(String c)
    {
      city=c;
    }
    String getName()
    {
      return name;
    }
    int getMarks()
    {
      return marks;
    }
    String getCity()
    {
      return city;
    }
    void display()
    {
      System.out.println("name-"+name);
      System.out.println("marks-"+marks);
      System.out.println("city-"+ city);
    }
  }

