
import java.util.*;
class NotGivenArray
  {
    public static void main(String args[])
    {
      int size;
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("the size is ");
      size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("the elements are");
      int i;
      for(i=0;i<a.length;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("the given elements are ");
       n=sc.nextInt();
      int count=0;
      {
        if(a[i]==n)
        {
          count++;
        }
      }
      if(count>0)
    System.out.println("enter the values are"+(i+1) +"----"+count);
      else
      System.out.println("not found the values");
    }
  }





 /*   public static void main(String[]args)
    {
      int n,x,count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size : ");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println(" Enter the Elements");
      for(int i=0;i<a.length;i++)
        {
          a[i]=ntr.nextInt();
        }
      System.out.println("Enter the elements you want to find :");
      x=sc.nextInt();
      int i,pos=0;
      for(i=0;i<a.length;i++)
        {
          if(a[i]==x)
          {
            count++;
             pos=i;
          }

          }
      if(count>0)
      {
        System.out.println("Element fount at poosition : "+(pos+1));
      }else{
            System.out.println(" Element Not found");
        }
   */
