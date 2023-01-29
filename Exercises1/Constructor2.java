import java.util.*;
class Constructor2
  {
    Constructor2( String snam,int num,String deg)
    {  
System.out.println(" "+snam+" "+num+" "+deg);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the name");
      String nam=sc.next();
      System.out.println("enter the id number");
      int num2=sc.nextInt();
      System.out.println("enter the position");
      String deg2=sc.next();
      Constructor2 kya=new Constructor2(nam,num2,deg2);
    }
  }