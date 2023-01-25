// Write a program to initialize your marks for 3 subjects and print the highest marks

public class Exercise3 {
  
  public static void main(String[] args)
  {
    int a,b,c;
    System.out.println("Enter the first subject:" + 48);
    a = (48);
    System.out.println("Enter the second subject:" + 58);
    b = (58);
    System.out.println("Enter the third subject:" + 56);
    c = (56);
    if(a > b && a > c)
    {
      System.out.println("Highest marks is:"+a);
    }
    else if(b > c)
    {
      System.out.println("Highest marks is:"+b);
    }
    else
    {
      System.out.println("Highest marks is:"+c);
    }  
  }
}