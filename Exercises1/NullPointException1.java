class NullPointException1
{
    public static void main(String args[])
    {
      String s=null;
      try
     {
      System.out.println(s.length());  
     }
    catch(NullPointerException n)
    {
      System.out.println(n);
      n.printStackTrace();
    }
      System.out.println("Hello Bitlabs");
    }
}