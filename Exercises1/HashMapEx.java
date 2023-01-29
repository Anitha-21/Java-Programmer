import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
    HashMap<String,String> hp =new HashMap<String,String>();
      hp.put("a","mango");
      hp.put("b","apple");  
      hp.put("c","banana");
      hp.put("d","grapes");
      hp.put("e","berries"); 
      System.out.println(hp);
      System.out.println("iterating the elements");
     for(Map.Entry R:hp.entrySet())
       {
         System.out.println(R.getKey()+" = "+R.getValue());
       }
    }
  }