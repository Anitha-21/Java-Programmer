import java.lang.*;
import java.util.*;
interface Values
  {
    abstract public void calculate(int n);
  }
class Square implements Values
  {
    public void calculate(int n)
    {
      int s=n*n;
      System.out.println("The square of n is "+s);
    }
  }
class Cube implements Values
  {
    public void calculate(int n)
    {
      int c=n*n*n;
      System.out.println("The cube of n is "+c);
    }
  }
class Root implements Values
  {
    public void calculate(int n)
    {
      double r=Math.sqrt(n);
      System.out.println("The root of n is "+r);
    }
  }  
class InterfaceCalculate
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the n value");
      int n=sc.nextInt();
      Values obj=new Square();
      Values obj1=new Cube();
      Values obj2=new Root();
      obj.calculate(n);
      obj1.calculate(n);
      obj2.calculate(n);
    }
  }