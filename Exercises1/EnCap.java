class Employee
  {
    String name;
    int id;
    int salary;
    public void setName(String name)
    {
      this.name=name;
    }
   public String getName()
    {
      return name;
    }
    public void setId(int id)
    {
      this.id=id;
    }
    public int getId()
    {
      return id;
    }
    public void setSalary(int salary)
    {
      this.salary=salary;
    }
    public int getSalary()
    {
      return salary;
    }
  }
class EnCap
  {
    public static void main(String args[])
    {
      Employee st=new Employee();
      st.setName("Mahesh");
      String sname=st.getName();
      System.out.println(sname);
      st.setId(201);
      System.out.println(st.getId());
      st.setSalary(10000);
      System.out.println(st.getSalary());
    }
  }