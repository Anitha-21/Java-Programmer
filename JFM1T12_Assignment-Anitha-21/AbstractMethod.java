//Abstract Method
abstract class Arthamatic
  {
    abstract public int print();
  }
class Add extends Arthamatic
  {
    public int print()
    {
      int a=10;
      int b=12;
      int c=a+b;
      return c;
    }
  }
class Multiple extends Arthamatic
  {
    public int print()
    {
      int d=4;
      int e=8;
      int f=d*e;
      return f;
    }
  }
class AbstractMethod
  {
    public static void main(String args[])
    {
      Add obj=new Add();
      Multiple obj1=new Multiple();
      System.out.println("the addition of two values are "+obj.print());
      System.out.println("the multiplacation of two values are "+obj1.print());
    }
  }
  