//write a program to print the char array using forloop
import java.util.*;
class CharArray
  {
    public static void main(String args[])
    {
      char ch[]=new char[5];
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the values ");
      for(int i=0;i<5;i++)
        {
          ch[i]=sc.next().charAt(0);
        }
      System.out.println("the array values are");
      for(int i=0;i<5;i++)
        {
          System.out.print(ch[i]+" ");
        }
    }
  }