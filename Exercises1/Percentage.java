/* WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F*/
import java.util.*;
class Percentage
  {
   public static void main(String args[])
    {
      int p,m,c,b,cs,percentage,total,av;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the percentage for five subjects ");
      
      percentage=sc.nextInt();
      if(percentage>=90)
      {
        System.out.println("the grade is A ");
      }
      else if(percentage>=80)
      {
        System.out.println("the grade is B ");
      }
      else if(percentage>=70)
      {
        System.out.println("the grade is C ");
      }
      else if(percentage>=60)
      {
        System.out.println("the grade is D ");
      }
      else if(percentage>=40)
      {
        System.out.println("the grade is E");
      }
      else
        {
        System.out.println("failed");
        }
    }
  }
