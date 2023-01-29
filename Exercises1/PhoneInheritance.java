class landLine
  {
    void dial()
    {
      System.out.println("Dialing");
    }
  }
class cellphone extends landLine
  {
    void chat()
    {
      System.out.println("chatting");
    }
  }
class PhoneInheritance extends cellphone
  {
    void games()
    {
      System.out.println("gamming");
    }
    void vc()
    {
      System.out.println("video call");
    }
    public static void main(String args[])
    {
      PhoneInheritance obj=new PhoneInheritance();
      obj.dial();
      obj.chat();
      obj.games();
      obj.vc();
    }
  }