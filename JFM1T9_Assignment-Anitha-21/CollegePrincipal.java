/* JFM1T9_Assignment4:
     Extend and enhance the previous inheritance program where collegeName, designation and 
     work() method are common to all the teachers and declared in the base class in the way
     that all child classes like MathTeacher, EnglishTeacher and MusicTeacher do not need to 
     write this code and can use directly from base class. 

     Sample Output:
     Math Teacher         IIT
     English Teacher      IIT
     Music Teacher        IIT
*/
class Teacher 
{
  String collegeName = "IIT";
  String designation = "Teacher";
public void work() 
  {
    System.out.println(designation+" "+collegeName);
  }
}
class MathsTeacher extends Teacher 
{
     
}
class EnglishTeacher extends Teacher 
{
     
}
class MusicTeacher extends Teacher 
{
     
}
class CollegePrincipal 
{
  public static void main(String[] args) 
  {
    String designation;
    MathsTeacher obj1 = new MathsTeacher();
    obj1.designation = "Maths Teacher";
    EnglishTeacher obj2 = new EnglishTeacher();
    obj2.designation = "English Teacher";
    MusicTeacher obj3 = new MusicTeacher();
    obj3.designation = "Music Teacher";
    obj1.work();
    obj2.work();
    obj3.work();
     }
}
//Add Teacher class

//Add MathTeacher class

//Add EnglishTeacher class




//class CollegePrincipal {

//Add the main method here and create all different types of Teacher objects and print there college name designation.


//}

//Good
