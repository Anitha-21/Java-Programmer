import java.util.*;
class Constructor
  {
    Constructor()
    {  
     String snam;
      int num;
      String deg;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name");
      snam=sc.next();
      System.out.println("enter the id number");
      num=sc.nextInt();
      System.out.println("enter the position");
      deg=sc.next();
System.out.println(" "+snam+" "+num+" "+deg);
    }
    public static void main(String args[])
    {
      Constructor kya=new Constructor();
    }
  }










/* class Constructor
  {
    Constructor(String sname,int id)
    {
      System.out.println(" "+sname+" "+"id"+id);
    }
    public static void main(String args[])
    {
      Constructor obj=new Constructor("Nani",123);
    }   */