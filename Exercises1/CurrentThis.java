class Current
  {
     String emp;
    int id;
    String company;
    long sal;
    Current(String emp,int id)
    {
      this.emp=emp;
      this.id=id;
    }
    Current(String emp,int id,String company)
    {
      this(emp,id);
      this.company=company;
    }
    Current(String emp,int id,String company,long sal)
    {
      this(emp,id,company);  
      this.sal=sal;
    }
    public void display()
    {      System.out.println("employee= "+emp+ " idno= "+id+ " company name= "+company+ " salary= "+sal);
    }
  }
    class CurrentThis
      {
        public static void main(String args[])
        {
          Current num=new Current("Mahesh",122,"Legato");
          Current num1=new Current("Anitha",123,"Wipro",20000);
          Current num2=new Current("Nani",134);
          num.display();
          num1.display();
          num2.display();
    }
  }
