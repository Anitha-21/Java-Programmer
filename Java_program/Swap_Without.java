//Write a program swap without using the third variable
class Swap_Without
  {
    public static void main(String args[])
    {
      int a, b;
      a=2;
      b=4;
      //Before swapping
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("The swap a is " +a);
      System.out.println("The swap b is " +b);
    }
  }