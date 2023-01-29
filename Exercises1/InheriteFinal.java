 class parent
  {
    String name="Elder";
    int num=12;
   void walk()
    {
      System.out.println("walking");
    }
    public void display()
    {
      System.out.println(name+" "+num);
    }
  }
class child extends parent
  {
    void talk()
    {
      System.out.println("talking");
    }
    void eat()
    {
      System.out.println("eating");
    }
    void walk()
    {
      System.out.println("child can walk");
    }
  }
class InheriteFinal
  {
    public static void main(String args[])
    {
     child obj=new child();
      obj.talk();
      obj.eat();
      obj.walk();
      parent obj1=new parent();
      obj1.walk();
      obj1.display();
    }
  }