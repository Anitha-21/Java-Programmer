import java.util.*;
class Not
  {
    public static void main(String args[])
    {
      boolean y;
      Scanner sc= new Scanner(System.in);
      System.out.println("The value of y is: ");
      y=sc.nextBoolean();
      System.out.println("The value of "+(!y));
    }
  }