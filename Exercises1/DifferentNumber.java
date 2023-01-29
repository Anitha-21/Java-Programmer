
 class DifferentNumber
  {
      public static void main(String args[])
    {
      System.out.println("the value is ");
      int m=1;
      for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print((m++)+" ");
            }
          System.out.println();
        }
    }
  }