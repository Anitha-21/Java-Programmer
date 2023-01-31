/* JFM1T10_Assignment3:

     Create an abstract class Shape with following data member and methods- 
     Create data members for height and width.
     Add getter and setter methods for height and width.
     Create methods for finding area and perimeter.
     Create three subclasses Square, Rectangle and EquilateralTriangle that extends Shape class and define both the methods.
     Write a program that will find the area and perimeter of 3 Shapes and print the details for all. 
     Prompt the user for the  values to be input from the terminal.
 
     Sample Input:
     Enter Width of Rectangle in meters
     10
     Enter Length of Rectangle in meters
     5
     Enter width of Equilateraltriangle
     15
     Enter radius of circle
     60

     Expected Output:
     Rectangle width: 10.0 meters and length: 5.0 meters
     Resulting area: 50.0 square meters
     Resulting perimeter: 30.0 meters 

     EquiTriangle side: 15.0meters
     Resulting area: 97 square meters
     Resulting perimeter: 45.0 meters 

     Circle radius : 60.0meters
     Resulting area: 11310 square meters
     Resulting perimeter: 377 meters  

*/
import java.util.*;                           
 abstract class Shape
{
  private double height;  
  private double width;  
  private double radius;
  private double side;
  public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   }
  public void setValues1(double radius)
  {
    this.radius=radius;
  }
  public void setValues2(double side)
  {
    this.side=side;
  }
  public double getSide()
  {
    return side;
  }
  public double getRadius()
 {
    return radius;
  }
   public double getHeight() 
   {
       return height;
   }
     
   public double getWidth() 
   {
       return width;
   } 
   public abstract double getArea();
  public abstract double getPerimeter();
}
class Rectangle extends Shape 
{
public double getArea()
    {
        return getHeight() * getWidth();
    }
  public double getPerimeter() 
  {
    return 2.0 * (getWidth() + getHeight());
  }
}
class Circle extends Shape 
{
   public double getArea() 
    {
        return 3.14*getRadius()*getRadius();
    }
  public double getPerimeter() 
  {
    return 2.0 * 3.14 * getRadius();
  }
}
class EquilateralTriangle extends Shape
{  
public double getArea()
  {
    return 0.433*getSide()*getSide();
  }
  public double getPerimeter()
  {
    return 3*getSide();
  }
}
class AreaPerimeter {
  public static void main(String[]args)
  {
    Shape shape;
Scanner s= new Scanner(System.in);
    System.out.println(" Enter Width of Rectangle in meters");
    double a=s.nextDouble();
    System.out.println("Enter Length of Rectangle in meters");
    double b=s.nextDouble();
    System.out.println("Enter radius of circle");
    double c=s.nextDouble();
    System.out.println("Enter width of Equilateraltriangle");
    double d=s.nextDouble();
    Rectangle obj = new Rectangle();
    shape = obj;
    shape.setValues(a, b);    
    System.out.println();
    System.out.println("Rectangle width: "+a+" meters and length: "+b+" meters");
    System.out.println("Resulting area: " + shape.getArea()+" square meters");
    System.out.println("Resulting perimeter: "+shape.getPerimeter()+" meters");
    
    Circle obj1=new Circle();
    shape=obj1;
    System.out.println();
    System.out.println("Circle radius: "+c);
    System.out.println("Resulting area: " + shape.getArea()+" square meters");
    System.out.println("Resulting perimeter: "+shape.getPerimeter()+" meters");
    
    EquilateralTriangle obj2=new EquilateralTriangle();
    shape=obj2;
    System.out.println();
    System.out.println("EquilateralTriangle side: "+d);
    System.out.println("Resulting area: " + shape.getArea()+" square meters");
    System.out.println("Resulting perimeter: "+shape.getPerimeter()+" meters");
  }
}


//Add Square class that extends Shape class

//Add Rectangle class that extends Shape class

//Add EquilateralTriangle class that extends Shape class

//class AreaPerimeter {

//Add the main method here and find Area and Perimeter 

//Use the scanner class to provide height and width at execution time
