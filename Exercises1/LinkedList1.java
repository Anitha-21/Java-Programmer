import java.util.*;
class LinkedList1
  {
    public static void main(String args[])
    {
      LinkedList<Integer> ll=new LinkedList<Integer>();
      ll.add(12);
      ll.add(14);
      ll.add(18);
      ll.add(25);
      ll.add(82);
      ll.add(92);
      ll.add(14);
      ll.add(null);
      System.out.println(ll);
      System.out.println(ll.size());
      ArrayList<Integer> al=new ArrayList<Integer>(ll);
      al.removeAll(ll);
      System.out.println(al);
      System.out.println(ll.subList(0,2));
      Vector<Integer> vc=new Vector<Integer>(ll);
      vc.removeAll(ll);
      System.out.println(vc);
    }
  }