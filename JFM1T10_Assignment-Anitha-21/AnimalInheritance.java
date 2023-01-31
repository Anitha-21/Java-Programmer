/*   JFM1T10_Assignment2:

     Create a class Animal that has a method makeSound(). 
     Then create two subclasses of Animal class: Horse and Cat that extends Animal class and 
     provide their specific implementation of makeSound() method.

     Sample Output:
     The animal makes a sound
     The Horse says: wee wee
     The Cat says: meow meow */

class Animal
  {
    String name1;
    String name2;
  }
class Horse extends Animal
  {
    void says()
    {
      System.out.println("The Horse says: Wee Wee");
    }
  }
class Cat extends Animal
  {
    void says2()
    {
      System.out.println("The Cat says: Meow Meow");
    }
    public void makeSounds()
    {
      System.out.println(name1+" "+name2);
    }
  }

//Add Animal class and Create Sound() method 

//Add Horse class that extends Animal class

//Add Cat class that extends Animal class

class  AnimalInheritance 
{
   public static void main(String args[])
  {
    System.out.println("The animals makes a sound");
    Cat obj=new Cat();
    obj.says2();
    Horse obj1=new Horse();
    obj1.says();
  }
 
//Add main method here

//Create all 3 Animal objects and add to an array 

//Loop over the array and print sound it makes

}

