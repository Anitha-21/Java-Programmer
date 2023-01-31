
class AddArrayD
{
    public static void main(String args[])
    {
      int x[][]={{12,15},{18,14}};
      int y[][]={{24,32},{20,16}};
      int z[][]=new int[2][2];
      System.out.println("the array of elements");
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {
            z[i][j]=x[i][j]+y[i][j];
            }
        }
      for(int i=0;i<2;i++)
        {
          for(int j=0;j<2;j++)
            {  
       System.out.print(z[i][j]+" ");
           }
          System.out.println(" ");
           }
    }
}
      