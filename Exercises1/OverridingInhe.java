// over riding using inheritance
class A
  {
    int a=4;
    void display()
    {
      int result=a*a;
      System.out.println("Area of Square is ");
      System.out.println(result);
    }
  }
class B extends A
  {
    int a=3;
    void display()
    {
      double result=3.14*a*a;
     System.out.println("Area of Circle is ");
      System.out.println(result);
    }
  }
class OverridingInhe
  {
    public static void main(String args[])
    {
      B ob=new B();
      ob.display();
      A oa=new A();
      oa.display();
    }
  }