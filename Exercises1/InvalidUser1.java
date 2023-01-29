import java.util.*;
class InvalidUserNameException extends Exception
  {
    public InvalidUserNameException(String us)
    {
      super(us);
    }
  }
class InvalidUser1
  {
    public static void checkName(String name) throws InvalidUserNameException
    {
      int count1=0,count2=0,count3=0;
     for(int i=0;i<name.length();i++) 
       {
         if(name.charAt(i)>='A' && name.charAt(i)<='Z')
         {
           count1++;
         }
         if(name.charAt(i)>='0' && name.charAt(i)<='9')
         {
           count2++;
         }
          if(name.charAt(i)>='a' && name.charAt(i)<='z')
          {
            count3++;
          }
       }
      if(count1>0 && count2>0 && count3>0)
      {
        System.out.println("User name is valid "+name);
      }
      else 
      {
        throw new InvalidUserNameException("User name is invalid");
      }
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the user name");
      String name=sc.next();
      try{
        checkName(name);
      }
      catch(InvalidUserNameException a)
        {
          System.out.println(a);
          a.printStackTrace();
        }
      System.out.println("Exception handled");
    }
  }