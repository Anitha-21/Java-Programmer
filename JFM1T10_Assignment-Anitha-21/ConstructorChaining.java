/* JFM1T10_Assignment1:

   Write a program to demonstrate Constructor chaining in Java 
   Add atleast 3 constructors

   Sample Output:
   Parent class default constructor
   Child class default constructor
   Parent class one-argument constructor
   Child class one-argument constructor

*/
class Parent
{
  Parent()
  {
    System.out.println("Parent class default constructor");
  }
    Parent(String x)
    {
     this();
     System.out.println(x);
    }
}
class Child
  {
    Child()
    {
     System.out.println("Child class default constructor"); 
    }
    Child(String x)
    {
      this();
      System.out.println(x);
    }
  }
 class ConstructorChaining
   {
    public static void main(String args[])
    {
     Child obj=new Child("Child class one-argument constructor");
      Parent obj1= new Parent("Parent class one-argument constructor");
    }
}