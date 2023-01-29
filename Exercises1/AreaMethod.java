import java.util.*;
class AreaMethod
  {
    //no return type with arguments
    public static void Area(int a)
    {
      int Area=a*a;
      System.out.println("the area of the square is "+Area);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the x value ");
      int x=sc.nextInt();
      System.out.println("the exacution starts from");
      Area(x);
    }
  }



/* import java.util.*;
class AreaMethod
  {
  //no return type no arguments
    public static void Area()
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter the a value");
      int a=sc.nextInt();
      int Area=a*a;
      System.out.println("the area of the square is "+Area);
    }
    public static void main(String args[])
    {
     System.out.println("execute the values");
     Area();    
    }
  }   */