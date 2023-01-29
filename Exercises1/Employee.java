class Employee
  {
    String sname;
    int id;
    long salary;
    String deg;
    public static void main(String args[])
    {
      Employee ob=new Employee();
      ob.sname="Mahesh";
      ob.id=12;
      ob.salary=4000000;
      ob.deg="manager";
   System.out.println(ob.sname+" "+ob.id+" "+ob.salary+" "+ob.deg);
       Employee st=new Employee();
      st.sname="Satya";
      st.id=18;
      st.salary=2000000;
      st.deg="senior";
      System.out.println(st.sname+" "+st.id+" "+st.salary+" "+st.deg);
       Employee pr=new Employee();
       pr.sname="Anitha";
       pr.id=24;
      pr.salary=1000000;
      pr.deg="Employee";  
      System.out.println(pr.sname+" "+pr.id+" "+pr.salary+" "+pr.deg);
   /* System.out.println(ob.sname+" "+ob.id+" "+ob.salary+" "+ob.deg);
      System.out.println(st.sname+" "+st.id+" "+st.salary+" "+st.deg);
      System.out.println(pr.sname+" "+pr.id+" "+pr.salary+" "+pr.deg);  */
    }
  }