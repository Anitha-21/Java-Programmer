class Reverse_String
  {
    public static void main(String args[])
    {
     String num= "Anitha"; 
     String temp="";        
      System.out.print("the original string is : ");
      System.out.println("Anitha ");         
      for (int i=0; i<num.length(); i++)
      {
        temp= num.charAt(i)+temp;
      }
      System.out.println("Reversed word: "+ temp);
    }
  }


/* Scanner sc=new Scanner(System.in);
  System.out.println("enter the string ");
  String s=sc.nextLine();
  String temp="";
for(int i=s.length()-1;i>=0;i++)
  {
    temp=temp+s.charAt(i);
  }
System.out.println("the reverse string is "+temp);
if(s.equal(temp))
{
System.out.println("enter the a palindrom ");
}
else
System.out.println("not a palindrom ");
 */