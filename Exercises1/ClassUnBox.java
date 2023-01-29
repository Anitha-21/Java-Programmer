class ClassUnBox
  {
    public static void main(String args[])
    {
   /*  Integer a=Integer.valueOf(23);
      int i=a.intValue();
      System.out.println("the value of i is:"+i);
      int j=a;
      System.out.println("the value of j is:"+j); */
       Integer i=new Integer(50);  
        int a=i;            
        System.out.println(a);  
    }
  }