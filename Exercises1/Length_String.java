// write a program to print the string length 
class Length_String
  {
    public static void main(String args[])
    {
      String a="Hellobitlabs";
      int vcount=0,rcount=0;
      for(int i=0;i<a.length();i++)
        {
        if((a.charAt(i)=='a'|| a.charAt(i)=='e' || a.charAt(i)=='i' ||a.charAt(i)=='o' || a.charAt(i)=='u' ||a.charAt(i)=='A' || a.charAt(i)=='E' || a.charAt(i)=='I' || a.charAt(i)=='O' || a.charAt(i)=='U'))
          {
            vcount++;
          }
          else
         {
           rcount++;
         }
        }
      System.out.println("the vowels in the string is "+vcount);
       System.out.println("the consonents in the string is "+rcount); 
    }
  }