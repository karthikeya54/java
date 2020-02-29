package Coaching;

/*
 
 this keyword:

this keyword will refer to the current instance (object) of a class.

Using this keyword we can access instance members (instance variables and instances methods) of a class.

Specifying this keyword is sometimes optional, sometimes mandatory.

Optional: If there is no confusion between instance variable and local variable then, specifying this keyword is optional.
  In such case, if we don't specify this keyword then, the compiler will automatically 
  specify this keyword and access instance variable.

Mandatory:  If there is confusion between instance variable and local variable then,
specifying this keyword is mandatory.  In such case if we don't specify this keyword then the compiler will also not specify 
this keyword and it will access local variable.  If we want to access the instance variable then the
programmer has to explicitly specify this keyword.

Note:  this keyword cannot be applied to local variable.

Note:  There is no concept of local methods i.e. we cannot specify a method inside another method.

 
 
 */


/*

public class ThisKeyword  {
    int a = 11;  //instance variables
    int b = 22;
    
    void show()  
    {
	int a = 33;  //local variables in an method
	int b = 44;
	int c=999;
	System.out.println(this.a);//11
	System.out.println(this.b); //22
	System.out.println(a); //
	System.out.println(b);
	System.out.println(c);
	//System.out.println(this.c);  //exception
	//this.msg ();   //There is no concept of local methods i.e., we cannot specify a method inside another method
     }
     public static void main (String[]  args)   {
    	 ThisKeyword   s = new ThisKeyword();
	s.show();
     System.out.println(s.a);
     
     }
}


*/


/*
this():  this() to refer to the zero parameterized constructor of current class.
this(...): this (...) is used to refer to the parameterized constructor of the current class.

Rules:
A constructor can invoke at most one constructor.
The invocation of the constructor must be specified as the first as the first statement.
The invocation of a constructor must not form a cycle or loop.
*/







class ThisKeyword  {
	
	ThisKeyword()
	{
		this(8,56);
	System.out.println("Sample zero constructor");
         }
	ThisKeyword (int x,int y)   
	{ this(34.56f,56);
	System.out.println("Sample int constructor");
         }
	ThisKeyword(float s,int w)
	{
		System.out.println(s+" "+w);
	}
	ThisKeyword (double Y )   
	{
 	this();
	System.out.println("sample double constructor");
          }
   public static void main (String[]  args)  
          {
        	  ThisKeyword s = new ThisKeyword(1.2);
          }
}



//Note: this()/this(...) are designed for calling constructors from other constructors.





















