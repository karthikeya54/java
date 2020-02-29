package Coaching;

public class Testing 
{

	int a=45;
	static float s=455.34f; //static variable alows in non static method
	 String name="Dev";  //nonstatic variable  wont allows in static method 
	
	protected void out()
	{
		System.out.println(a);
	}
	
	 Testing()
	{
		System.out.println("iam empty constructor without parameters");
	}
	
	void two()
	{
		System.out.println(s);
	}
	
	void three()
	{
		System.out.println(name);
	}
	
//	static void hello()
//	{
//		System.out.println(name);  // non-static variable doesnt allows into static method 
//	}
	
	public static void main(String[] args) {
		
		Testing q=new Testing();
		
		q.out();
		q.two();
		q.three();
		System.out.println(q.s);
		System.out.println(Testing.s);  //static means it belongs to class, but not object  & when we use static variable we can call that variable by classname.variablename
		//System.out.println(Testing.name); //we cant call this variable by classname(Additon) becz name variable is instance variable 
	}
	
}
