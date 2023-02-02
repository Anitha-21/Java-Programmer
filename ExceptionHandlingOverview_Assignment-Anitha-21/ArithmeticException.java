/* 1. Write a program which will illustrate ArthmeticException. Create a parameterized method which can take two values and print division of two numbers. 
Please write your comments regarding ArithmeticException such as "When ArithmeticException will occur in this program?"
*/
public class ArithmeticException 
{
 void division(int a,int b)
  {
    int c=a/b;
  System.out.println("Division is done on the a and b values");
     System.out.println("Value division: "+c);
   }
  public static void main(String[] args)
   {
   ArithmeticException ae=new ArithmeticException();
//Any value is divisible by 0, it will throw the ArthmeticEcception 
    ae.division(10,0);
   }
}