 /* import java.util.*;
 class Empty
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of the array is ");
      int n[]=sc.nextInt();
      System.out.println("Enter the elements");
      for(int i=0;i<n;i++)
      {
         System.out.println(n[i]+" ");
      }
      Arrays.sort(n);
      System.out.println();
      System.out.println("Elements of array sorted in ascending order : "+ Arrays.toString(n));
   }
}  */








 /* import java.util.*;
import java.util.Arrays;
public class Empty 
{
   public static void main(String[] args) 
  {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size");
int arr[]=sc.nextInt();
int temp=0;
System.out.println("elements before sorting:");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
for(int i=0;i<arr.length;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
       temp=arr[i];
       arr[i]=arr[j];
       arr[j]=temp;
     }
  }
   }
  System.out.println();
  System.out.println("elements after sorting");
  for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}
  }
}    */



class Empty
{
    String name="Anitha";
    int age=21;
    String add="LB Nagar";
    String name1="Rohit";
   int age1 =21;
  String add1="Hi-tech City";
    class Student
    {
     void display()
      {
         System.out.println("the student details are "+name+" Age "+age+" Address "+add);
        System.out.println("the student details are "+name1+" Age "+age1+" Address "+add1);
        }
    }
    public static void main(String args[])
    {
        Empty obj=new Empty();
        Empty.Student in=obj.new Student();
        in.display();
    }
}