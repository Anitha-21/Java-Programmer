

class CopyArray
  {
    public static void main(String args[])
    {
      int a[]={12,14,53,24,80};
      int b[]=new int[a.length];      
  // System.out.println("the array values are ");
      for(int i=0;i<a.length;i++)
        {
        b[i]=a[i] ;
        }
     System.out.println("the values are in second part is");
      for(int i=0;i<a.length;i++)
        {
          System.out.print(b[i]+" ");
        }
      
    }
  }