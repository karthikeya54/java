package Coaching;



/*
// object does something of methods and object knows, something with help of variables. 

class Employee
{
	public int Emplyid;
	private String Emplyname;
	
	
	void rabit()
	{
		System.out.println(Emplyid);
	}
	
}


public class GettersAndSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj1=new Employee();
		obj1.Emplyid=45; //HEre emplyid is visibling because it is in  public 
		//System.out.println(obj.Emplyid);  //object cannot be resolved to variable, Emplyid is an instance variable we cant assign a value(if we asign also we cant print it out becz its not local variable)
		//So we have to assign any value to the instance variable by using methods i.e., by getter and setter methods
		
			
		//which are in private acces it wont be visible in another class
		
		//when we are using getters and setters for particular variable , Rule is : To keep before variable, 
		  private access modifier
		//And write setter method to set the value, and getter method for getting/retrieving value...
		//Those setter method and getter methods should be public
		
		//Always keep variables as private and methods as public, 
		 for the security(if we keep varibles also as public, then variables can also acessible in main() also/ from anywhere)
		//So we are binding the variables with methods(by keeping varibles as private & methods as public)
		 
		//when ever we bind the data with methods this concept is called Encapsulation.
		// Encapsulation is done by settermethods and gettermethods 
		 //Better to acces variables with help of methods...(Maintain private variables & public setter & public getter methods)
		 
	
	
	}

}


*/

/*

class Employee
{
	private int Emplyid;
	private String Emplyname;
	
	
	public int getEmplyid() {
		return Emplyid;
	}
	public void setEmplyid(int emplyid) {
		Emplyid = emplyid;
	}
	public String getEmplyname() {
		return Emplyname;
	}
	public void setEmplyname(String emplyname) {
		Emplyname = emplyname;
	}
}

public class GettersAndSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj1=new Employee();
		 obj1.setEmplyid(30);  //so by using 
		 System.out.println("empl id is "+obj1.getEmplyid());
		 
		 
		
	}
}
		
		
		*/






class OMkars
{
	private int printerprice;
	private String printername;
	
	public int getPrinterprice() {
		
		return printerprice;
	}
	public void setPrinterprice(int printerprice) {
		this.printerprice = printerprice;
	}
	public String getPrintername() {
		
		return printername;
	}
	
	public void setPrintername(String printername) {
		this.printername = printername;
	}
	
	
	
	
	
	
}

class GettersAndSetters
{
	int f=4545;
	public static void main(String[] args) {
		
		OMkars var=new OMkars();
		
		var.setPrintername("Delll");
		System.out.println(var.getPrintername());
		
		var.setPrinterprice(54546);
		System.out.println(var.getPrinterprice());
		
		System.out.println();
		
	}
	
}

























