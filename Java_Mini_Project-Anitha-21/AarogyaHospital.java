//package aarogya_hospital;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.*;


// the main class
public class AarogyaHospital
{
	static int count=0;
        // class for storing the patient information
	class AarogyaMember
  {
  String name,gender,city,address,dateofadmission, guardianname,guardianaddress;
  int age,id;
  long  aadharnumber,contactnumber, guardiannumber;
          // declare all the details for the patient including name, age, gender, Aadhar Card number, contact number, city, address, date of admission, guardian name, guardian address, guardian contact number
	
	    // make constructor for the class and assign it a unique Id
	    public AarogyaMember()
    {
	    	count++;
    id=count;
	    }
    	    // for taking patient information
	    public void input()
    {
	    Scanner sc=new Scanner(System.in);
      System.out.println("Enter the patient details");
      System.out.println("Name of the patient");
      name=sc.next();
      System.out.println("Age of the patient");
      age=sc.nextInt();
      System.out.println("Gender of the patient");
      gender=sc.next();
      System.out.println("Enter the id");
      id=sc.nextInt();
      System.out.println("Enter the patient Adhar number");
      aadharnumber=sc.nextLong();
        System.out.println("Enter the patient number");
      contactnumber=sc.nextLong();
        System.out.println("Enter the patient city");
      city=sc.next();
        System.out.println("Enter the patient address");
      address=sc.next();
        System.out.println("Enter the patient date of admission");
      dateofadmission=sc.next();
        System.out.println("Enter the guardian Name");
      guardianname=sc.next();
        System.out.println("Enter the guardian address");
      guardianaddress=sc.next();
      System.out.println("Enter the guardian number");
      guardiannumber=sc.nextLong();
      System.out.println();
	    }	      
	}
  public static void display(AarogyaHospital.AarogyaMember p)
  {
    System.out.println(p.name+p.age+p.gender+p.city+p.id+p.contactnumber+p.aadharnumber+p.address+p.dateofadmission+p.guardianname+p.guardianaddress+p.guardiannumber);
    System.out.println();
  }

	// pick the choice of task to be performed
	static long choices()
  {
		System.out.println("Press 1 for adding new member");
		System.out.println("Press 2 to view list of all available members");
		System.out.println("Press 3 to search member by ID");
		System.out.println("Press 4 to search member from a particular city");
		System.out.println("Press 5 to search member from a particular age group");
		System.out.println("Press 6 to mark recovery of a member");
		System.out.println("Press 7 to delete data of a member");
		System.out.println("Press 0 to exit");
		System.out.println();
            // create scanner class to take input
    Scanner sc=new Scanner(System.in);
    System.out.println("choose the option");
	    long option=sc.nextLong();
    System.out.println();
	    return option;
	}

	public static void main(String args[])
  {
		ArrayList<AarogyaMember> pa=new ArrayList<AarogyaMember>();
    AarogyaHospital ah=new AarogyaHospital();
    Scanner sc=new Scanner(System.in);
    Iterator<AarogyaMember> i=pa.iterator();
		// initialise array list to store list of patients information
		
		//for adding aarogya member information
		while(true)
    {

			//take choice
			long option=choices();
			
			//invalid choice
			if(option<0||option>7)
      {
			
			}
			// take the input and add in the arrayList
			else if(option==1)
      {
	    AarogyaHospital.AarogyaMember newpat=ah.new AarogyaMember();
     newpat.input();
     pa.add(newpat);
        	        }
			//iterate and print all the patients information
	 else if(option==2)
    {
	  int count=0;
   i=pa.iterator();
   while(i.hasNext())
   {
  AarogyaHospital.AarogyaMember p=i.next();
    display(p);
     count++;
  System.out.println(" ");
  }
if(count==0)
  {
   System.out.println("not found");
   }
}
			
			// print details of the patient with a particular id (take id as input)
	else if(option==3)
  {
	 int count=0;
  System.out.println("enter the id");
  int sid=sc.nextInt();
   i=pa.iterator();
  while(i.hasNext())
   {
  AarogyaHospital.AarogyaMember p=i.next();
   if(p.id==sid)
  {
    display(p);
    count++;
  System.out.println();
  }
}
  if(count==0)
  {
  System.out.println("not found "+sid);
  }
}
			
			// to print all the patients from a particular city (take city as input)
 else if(option==4)
   {
	  int count=0;
    System.out.println("Enter the city");
  String scity=sc.next();
    i=pa.iterator();
   while(i.hasNext())
   {
  AarogyaHospital.AarogyaMember p=i.next();
     if(p.city.equals(scity))
   {
     display(p);
    count++;
    System.out.println();
    }
   }
 if(count==0)
   {
  System.out.println("not found "+scity);
   }
 }
			// to print details of all the patients in a particular age group (take age limits as input)
      else if(option==5)
     {
	  int count=0;
System.out.println("Enter the age");
    int sage=sc.nextInt();
   System.out.println("Enter the end age");
    int eage=sc.nextInt();
    i=pa.iterator();
    while(i.hasNext())
  {
    AarogyaHospital.AarogyaMember p=i.next();
    if(p.age>=sage && p.age<=eage)
     {
       display(p);
      count++;
    System.out.println();
      }
    }
  if(count==0)
    {
    System.out.println("not found ");
   } 
 }
	              // take member id as input to maintain recovered information of patient
  else if(option==6)
    {
	  int count=0;
   System.out.println("Enter the id");
    int id=sc.nextInt();
  i=pa.iterator();
  while(i.hasNext())
  {
  AarogyaHospital.AarogyaMember p=i.next();
   if(p.id==id)
  {
     System.out.println(p.id);
       count++;
  }
 }
  if(count==0)
   {
  System.out.println("not found ");
   }
}
	              //take member id as input to delete patient information
else if(option==7)
  {
  System.out.println("Enter the id");
    int id=sc.nextInt();
    i=pa.iterator();
   while(i.hasNext())
  {
   AarogyaHospital.AarogyaMember p=i.next();
    if(p.id==id)
  {
   i.remove();
  System.out.println("deleted");
  }
}
System.out.println();         
 }
else 
  {
	break;
	}
		}
	}
}

 
