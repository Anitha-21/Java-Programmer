//write a progtam to print the number pattern
class NumberPattern
    {
    public static void main(String args[])
    {
      for(int i=1;i<=5;i++)
        {
          for(int j=1;j<=i;j++)
            {
              System.out.print(j+" ");
            }
          System.out.println();
        }
    }
 }
//  System.out.print(i+" ");
/* 1
   22
   333
   4444
   55555 */