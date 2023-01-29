//InterfaceMethod of Area of Calculation
interface Area
  {
    abstract public void areaOfCalculation();
  }
class Rectangle implements Area
  {
    public void areaOfCalculation()
    {
      int l=5,b=4;
      int a=l*b;
      System.out.println("Area of rectangle is "+a);
    }
  }
class Square implements Area
  {
    public void areaOfCalculation()
    {
      int s=4;
      int sq=s*s;
      System.out.println("Area of square is "+sq);
    }
  }
class Circle implements Area
  {
    public void areaOfCalculation()
    {
      double r=8.5;
      double c=3.14*r*r;
      System.out.println("Area of circle is "+c);
    }
  }
class InterfaceMethod
  {
    public static void main(String args[])
    {
      Area obj=new Rectangle();
      Area obj1=new Square();
      Area obj2=new Circle();
      obj.areaOfCalculation();
      obj1.areaOfCalculation();
      obj2.areaOfCalculation();
    }
  }