/*import java.io.*;
class SampleFile
{
  public static void main(String args[]) throws IOException
  {
    File a=new File("filesf");
    if(a.mkdir())
    {
      System.out.println("created");
    }
    else
    System.out.println("not created");
  }
} */



/*import java.io.*;
class SampleFile
  {
    public static void main(String args[])
    {
   File b=new File("filesf");
    String filesf[]=b.list();
      for(int i=0;i<filesf.length;i++)
        {
          System.out.println(filesf[i]);
        }
    }
  } */
/*import java.io.*;
class SampleFile
  {
    public static void main(String args[])
    {
      File c=new File("filesf/sample.txt");
      System.out.println(c.exists());
    }
  } */

/*import java.io.*;
class SampleFile
{
  public static void main(String args[]) throws IOException
  {
    FileOutputStream fou=new FileOutputStream("files/data.txt");
   try{
     String str="welcome to bitlabs";
     byte b[]=str.getBytes(); //converting the string into byte arry
    fou.write(b);
    fou.close();
    System.out.println("success");
   }
    catch(IOException e)
     {
       System.out.println(e);
     }
  }
}   */



/*import java.io.*;
class SampleFile
{
  public static void main(String args[]) throws IOException
  {
    FileInputStream fou=new FileInputStream("filesf/sample.txt");
   try{
     String str="welcome to bitlabs";
     byte f[]=str.getBytes(); 
    fou.read(f);
    fou.close();
    System.out.println("success");
   }
    catch(IOException e)
     {
       System.out.println(e);
     }
  }
}  */



import java.io.*;
class SampleFile
  {
    public static void main(String args[]) throws IOException
    {
      FileReader fl=new FileReader("filesf/data.txt");

     int i;
      while((i=fl.read())!=-1)
        {
          System.out.print((char)i);
        }
    }
  } 
  
  






















































  /*  import java.io.*;
class SampleFile
{​​
  public static void main(String args[]) throws IOException
  {​​
    File f=new File("sample.txt");
    if(f.exists())
    {​​
      System.out.println("name of the file "+f.getName());
      System.out.println("path of the file "+f.getAbsolutePath());
      System.out.println("can read "+f.canRead());
      System.out.println("can write "+f.canWrite());
      System.out.println("size of the file "+f.length());
    }​​
  }​​
}​​
  
​[2:40 PM] Sowjanya Uppu
    import java.io.*;
class SampleFile
{​​
  public static void main(String args[])
  {​​
    File f=new File("files");
    if(f.mkdir())
    {​​
      System.out.println("created");
    }​​
    else
      System.out.println("not created");
  }​​
}​​
  
​[2:45 PM] Sowjanya Uppu
    import java.io.*;
class SampleFile
{​​
  public static void main(String args[])
  {​​
    File f=new File("files");
    String files[]=f.list();
    for(int i=0;i<files.length;i++)
      {​​
        System.out.println(files[i]);
      }​​
  }​​
}​​
  
​[2:47 PM] Sowjanya Uppu
    import java.io.*;
class SampleFile
{​​
  public static void main(String args[])
  {​​
    File f=new File("files/sample.txt");
    System.out.println(f.delete());
       
  }​​
}​​
*/
  
