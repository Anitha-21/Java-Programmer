/* 2. Write a program which will illustrate NumberFormatException. Create a test method, with in the test method accept two numbers 
   using next() method of scanner class. Convert into numerical values and print addition of two numbers. 
   Please write your comments regarding NumberFormatException such as "When NumberFormatException will occur in this program?"
*/
import java.util.*;
public class NumberFormatException 
{
  void test(int a,int b)
      {
        int sum=a+b;
        System.out.println(sum);
      }
    public static void main(String args[])
  {
      Scanner sc = new Scanner(System.in);
      NumberFormatException obj = new NumberFormatException();
      System.out.println("Enter a first number");
      int num1 = sc.nextInt();
      System.out.println("Enter the second number");
      int num2 = sc.nextInt();//NumberFormatException will occur
      obj.test(num1,num2);
    }
  }
