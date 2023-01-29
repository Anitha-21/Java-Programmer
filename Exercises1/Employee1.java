class Employee1
  {
    String sname;
    int rn;
    long sal;
    public void employee(String nam,int num,long lang)
    {
    sname=nam;
    rn=num;
    sal=lang;
    }
 public void display()
  {
  System.out.println(sname+" "+rn+" "+sal);
  }
    public static void main(String args[])
    {
      Employee1 st=new Employee1();
      st.employee("mahi",122,100000);
      st.display();
      Employee1 st1=new Employee1();
      st1.employee("ani",123,100000);
      st1.display();
    }
  }