//using final keyword
class FinalKeyword
{
   final int a=10000;
   void display()
  {  
   //  a=10500;
    System.out.println(a);
   }  
   public static void main(String args[]){  
      FinalKeyword obj=new FinalKeyword();
      obj.display();  
   }
}