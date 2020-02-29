package Coaching;


/*

public class DemotoString 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(1,"Deva");  //it pases via constructor
		System.out.println(e1.Empid);
		System.out.println(e1.Empname);
		
		
	}
}


class Employee
{
	int Empid;
	String Empname;
	
	public Employee(int Empid,String Empname)
	{
		this.Empid=Empid;
		this.Empname=Empname;   //by using this keyword we differentiate b/w local variabls vs instance variables
		}
	
}


*/









public class DemotoString 
{
	public static void main(String[] args)
	{
		Employee e1=new Employee(1,"Deva");
		System.out.println(e1);    //It by defaultly calls toString();  //e1.toString(); it also prints packagename.classname@hashcode
									//In e1 object(we expect id,name values), but it prints packagename.classname@hashcode
									//toString(); belongs to Object class.
		
	}
}
class Employee     //extends Object  //(in java every class defaultly extends Object Parent class)
{
	int Empid;
	String Empname;
	
	public Employee(int Empid,String Empname)
	{
		this.Empid=Empid;
		this.Empname=Empname;
	}	
	
		//@OverRiding   //normal String toString()   
		public String toString()
		{
			return Empid+" : "+Empname;    //it converts from hashcode of the object to wt ever the data is present in variables and it printout(returns)
		}
		
		
		

	
}