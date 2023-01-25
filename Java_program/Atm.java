//write a program to print the ATM
import java.util.*;
class Atm
  {
    public static void main(String args[])
    {
      int a,b,option;
      Scanner sc=new Scanner(System.in);
      System.out.println("The deposit ");
      System.out.println("the withdraw ");
      System.out.println("the checkbalance ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      int c=a+b;
      int c=a-b;
      int c;
      switch(option)
      {
        case 1:
          
       System.out.println("the deposit amount is "+c);
            break;
          case 2:
         
            System.out.println("the withdraw is ");
            break;
          case 3:
            System.out.println("the Balance is "+c);
            defalut:
            System.out.println("invalid amount");
        }
    }
  }