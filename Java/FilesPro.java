import java.io.*;
class FilesPro
{
  public static void main(String args[]) throws IOException
  {
    File f=new File("data.txt");
    try
      {
    if(f.createNewFile())
    {
      System.out.println("created successfully");
    }
    else
    {
      System.out.println("unscuccess");
    }
      }
    catch(IOException e)
      {
        System.out.println(e);
      }
  }
}