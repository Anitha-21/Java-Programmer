//WAP to count total number of notes in given amount
import java.util.*;
class Notes
  {
    public static void main(String args[])
    {
      int amount, total;
      Scanner sc=new Scanner(System.in);
      System.out.println("the amount is");
      amount=sc.nextInt();
      if(amount>=1000)
      {
        total=amount/1000;
        System.out.println("the 1000 notes are "+total);
        amount= (amount-total*1000);
      }
      if(amount>=100)
      {
        total=amount/100;
        System.out.println("the 100 notes are "+total);
        amount=(amount-total*100);
      }
      if(amount>=50)
      {
        total=amount/50;
        System.out.println("the 50 notes are "+total);
        amount=(amount-total*50);
      }
      if(amount>=10)
      {
        total=amount/10;
        System.out.println("the 10 notes are "+total);
        amount=(amount-total*10);
      }
      if(amount>=1)
      {
        total=amount/1;
        System.out.println("the 1 notes are "+total);
        amount=(amount-total*1);
      }
    }
  }