/*WAP to print all even numbers between 1 to 100. - using while loop */
import java.util.*;
class Even_Number
  {
    public static void main(String args[])
    {
      int i=1,n,sum=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("the numbers 1 to 100 ");
      n=sc.nextInt();
      while(i<=n)
        {
          if(i%2==0){
          System.out.print(i+" ");
            //sum=sum+i;
          }
          //sum=sum+i;
          i++;
        }
      //System.out.println(" ");
      //System.out.println("the sum of numbers are "+sum);
    }
  }