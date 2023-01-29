//write a program to print the natural numbers
import java.util.*;
class Natural_Numbers
  {
    public static void main(String args[])
    {
      int i=1,n;
      Scanner sc=new Scanner(System.in);
      System.out.println("the n value is ");
      n=sc.nextInt();
      i=1;
      while (i<=n)
        {
          //if(i%2==0){
            System.out.print(i+" ");
          
          i++;
        }
    }
  }