/* WAP to input electricity unit charges and calculate total     electricity bill according to the given condition:
  For first 50 units Rs. 0.50/unit
   For next 100 units Rs. 0.75/unit
   For next 100 units Rs. 1.20/unit
   For unit above 250 Rs. 1.50/unit
  An additional surcharge of 20% is added to the bill*/
import java.util.*;
class Bill
  {
    public static void main(String args[])
    {
      int units;
      double bill;
      Scanner sc= new Scanner(System.in);
      System.out.println("the total units ");
      units=sc.nextInt();
      if(units>=50)
      {
        bill=(units*0.50);
      }
      else if(units<=150)
      {
        bill=((units-150)*0.75+(50*0.50));
      }
      else if(units<=250)
      {
        bill=((units-250)*1.20+(100*0.75)+(50*0.50));
      }
      else
      {
        bill=(((units-250)*1.50)+(50*0.50)+(100*0.75)+(100*1.20));
      }
      double price=bill+((bill*20)/100);
      System.out.println("the bill is "+price);
    }
  }