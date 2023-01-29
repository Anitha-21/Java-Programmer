//Write a program to print the frequec
class Frequency
  {
    public static void main(String args[])
    {
      int a[]={2,1,2,3,1};
      boolean visited[]=new boolean[a.length];
      for(int i=0;i<a.length;i++)
        {
          visited[i]=false;
        }
      System.out.println("the elements are ");
      for(int i=0;i<a.length;i++)
        {
          int count=1;
          if(visited[i]==true)
            continue;
          for(int j=i+1;j<a.length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                visited[j]=true;
              }
            }
          System.out.println("the frequency is "+a[i]+ "-----" +count);
        }
    }
  }