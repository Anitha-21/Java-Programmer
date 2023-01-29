import java.util.*;
class LinkedHashSet1
  {
    public static void main(String args[])
    {
  LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
      lhs.add(12);
      lhs.add(14);
      lhs.add(26);
      lhs.add(29);
      lhs.add(null);
      lhs.add(null);
      lhs.add(14);
      System.out.println(lhs); 
      ArrayList<Integer> al=new ArrayList<Integer>(lhs);
      System.out.println(al);
    }
  }