/*WAP to input basic salary of an employee and calculate its Gross     salary according to following:
    Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95% */
import java.util.*;
class Gross
  {
    public static void main(String args[])
    {
      int bs,hra,da,gross;
      Scanner sc=new Scanner(System.in);
      System.out.println("the bs is ");
      bs=sc.nextInt();
      if(bs<=10000)
      {
        hra=(bs*20)/100;
        da=(bs*80)/100;
        gross=(bs+hra+da);
        System.out.println("the gross salary is "+gross);
      }
      else if(bs>10000 && bs<=20000)
      {
        hra=(bs*25)/100;
        da=(bs*90)/100;
        gross=(bs+hra+da);
        System.out.println("the gross salary is "+gross);
      }
      else if(bs>20000)
      {
        hra=(bs*30)/100;
        da=(bs*95)/100;
        gross=(bs+hra+da);
        System.out.println("the gross salary is "+gross);
      }
      else
        System.out.println("There is no extra salary");
      
    }
  }