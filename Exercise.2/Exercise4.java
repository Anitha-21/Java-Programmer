// Write a program to perform bitwise AND and OR operation on x=10 and y=20

 public class Exercise4 {
 
   public static void  main(String args[])
   {
     // Initial values
     int x = 10;
     int y = 20; 
     // bitwise and
     System.out.println("x & y = " + (x & y)) ;
     // bitwise or
     System.out.println("x | y = " + (x | y)) ;
     x &= y;
   }
}
