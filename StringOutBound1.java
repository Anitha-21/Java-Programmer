class StringOutBound1
{
   public static void main(String[] args) 
  {
      String str = "Hello Bitlabs";
      for(int i=0;i<str.length();i++) 
      {
         System.out.println(str.charAt(i));
      }
      System.out.println(str.charAt(20));
   }
}





//Null Pointer Excetpion
/*class ExceptionEx
  {
    public static void main(String args[])
    {
      String s=null;
      try
     {
      System.out.println(s.concat("hello"));  
     }
    catch(Null Pointer Exception n)
    {
      System.out.println(n);
    }
    }
  }  
//Number Format Exception
class ExceptionEx
  {
    public static void main(String args[])
    {
      String s="123@a";
      int x=Integer.parseInt(s);
      System.out.println("x value:"+x);
          
      
    }
  }
*/