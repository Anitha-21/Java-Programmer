
class TwoDArray
{
    public static void main(String args[])
    {
      float a[][]=new float[3][4];
      a[0][1]=23.7f;
      a[0][2]=28.9f;
      a[0][3]=69.8f;
      a[1][0]=12.6f;
      a[1][1]=47.8f;
      a[1][3]=57.9f;
      System.out.println("the array element are");
      for(int i=0;i<3;i++)
        {
          for(int j=0;j<4;j++)
            {
              System.out.print(a[i][j]+" ");
            }
          System.out.println();
        }
    }
}
