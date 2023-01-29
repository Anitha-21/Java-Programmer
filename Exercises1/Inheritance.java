class Animals
  {
    String name1;
    String name2;
    int legs;
    String colour;
  }
class cat extends Animals
  {
    void eat()
    {
      System.out.println("eating");
    }
  }
   class Dog extends Animals
     {
      void bow() 
       {
         System.out.println("Bow Bow");
       }
        public void display()
       {
         System.out.println(name1);
         System.out.println(name2);
         System.out.println(legs);
         System.out.println(colour);
       }
     }
class Inheritance extends Animals
  {
       public static void main(String args[])
       {
        Dog obj=new Dog();
         obj.name1="cat";
         obj.name2="Dog";
         obj.legs=4;
         obj.colour="Black";
         cat obj1=new cat();
         obj1.eat();
         obj.bow();
         obj.display();
       }
     }