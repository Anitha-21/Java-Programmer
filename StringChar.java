
class StringChar
  {
    public static void main(String args[])
    {
      String s=new String("bitlabs");
      char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++)
        {
          System.out.print(ch[i]+" ");
        }
      String s1=new String(ch);
      System.out.println(" ");
      System.out.println(s1);
    }
  }