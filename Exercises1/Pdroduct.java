import java.util.*;
class Pdroduct
  {
    String nam;
    String add;
    long num;
    String name;
    String brand;
    String col;
    String ch;
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Pdroduct num1[]=new Pdroduct[3];
      for(int i=0;i<3;i++)
        {
          num1[i]=new Pdroduct();
         System.out.println("enter customer name");
          num1[i].nam=sc.next();
          System.out.println("enter add");
          num1[i].add=sc.next();
          System.out.println("enter number");
          num1[i].num=sc.nextLong();
          System.out.println("enter product name");
          num1[i].name=sc.next();
          System.out.println("enter brand name ");
          num1[i].brand=sc.next();
          System.out.println("enter colour");
          num1[i].col=sc.next();
          System.out.println("enter size");
          num1[i].ch=sc.next();
        }
      System.out.println("the pdoduct details are");
      for(int i=0;i<3;i++)
        {
       System.out.println(num1[i].nam+" "+num1[i].add+" "+num1[i].name+" "+num1[i].brand+" "+num1[i].col+" "+num1[i].ch);
        }
      }
  }
