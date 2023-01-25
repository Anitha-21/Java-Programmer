//write a program to print the Unary operator
class Unary
  {
    public static void main(String args[])
    {
      int x=25,y=20;
      System.out.println("unary operator "+(x-- + ++x));
      System.out.println("unary operator "+(++x - y++));
      System.out.println("unary operator "+(--y - y--));
      System.out.println("unary operator "+(--x + x++));
      System.out.println("unary operator "+(y++ + x++));
      System.out.println("unary operator "+(x++ + y++));
      System.out.println("unary operator "+(y-- + y--));
    }
  }