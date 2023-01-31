//
class parent
  {
    String name="Black";
    String num="Dog";
  }
class child extends parent
  {
    String name="white";
    String num="cat";
    void display()
    {
      System.out.println("the colour of the child is "+name+" "+num+" the colour of the parent class is "+super.name+" "+super.num);
    }
  }
class RidingOver
  {
    public static void main(String args[])
    {
      child obj= new child();
      obj.display();
    }
  }