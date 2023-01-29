import java.util.*;
class HashSet1
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size");
      int size=sc.nextInt();
      System.out.println("Enter the elements");
      HashSet<Integer> hs=new HashSet<Integer>();
      for(int i=0;i<size;i++)
        {
          hs.add(sc.nextInt());
        }
      System.out.println(hs);
    }
  }