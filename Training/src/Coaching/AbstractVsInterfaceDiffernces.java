package Coaching;

/*
							Differences between abstract class and interface
							
					Abstract class										Interface

1)  An abstract class is a combination of abstract	 	1)  An interface is a collection of only abstract
methods and concrete methods.									methods.

2)  An abstract class can contain abstract methods,		2)  An interface will contain only abstract 
concrete methods, instance methods and static				methods which are instance methods.
methods.

3)  Declaring an abstract method with abstract 			3)  Declaring an abstract method with abstract
keyword in an abstract class is mandatory.					keyword in an interface is optional.

4)  The members of an abstract class can be 			4)  The members of an interface will be only
either public or not public.								public.

5)  The value of the variables in an abstract class		5)  The value of the variables in an interface
can be modified or fixed.									cannot be modified because they are by default 	fixed

6)  An abstract class can contain both					6)  An interface can contain only static
 instance variables and static variables.						variables.

7)  An abstract class will contain a 					7)  An interface will not contain a constructor.
constructor whether we specify or not

8)  An abstract class can be inherited into a class		8)  An interface can be inherited into a class
 by using extends keyword	by using implements keyword.

9)  An abstract class can extend at most one class.		9)  An interface can extend any number of 	interfaces.

10)  Using abstract class we cannot achieve				10)  Using interface we can achieve multiple
multiple inheritance.	inheritance.

11)  An abstract class can implement any 				11)  An interface cannot implement any 
number of interfaces	interfaces.

12)  An abstract class can inherit from both 			12)  An interface can inherit fro only interface.
class and interfaces

13)  Object is the super most class of all the classes.	13)  There is no super interface in java.

14)  An abstract class will contain final methods.		14)  An interface cannot have final methods.

15)  An abstract class will contain abstract			15)  An interface will contain abstract methods 
methods so that different programmers						 given by the client, so that the 
provide different implementation.								programmer provides implementation class.




*/


/*
//ab -1

public abstract class AbstractVsInterfaceDiffernces 
{

	abstract void iamabstractmethod();  //abstract methods
	void concreteMethod()
	{
		System.out.println("abstract class allows Concrete method(means normal method)");
	}
	
}

*/


/*
//inter -1
interface AbstractVsInterfaceDiffernces 
{
	void abstractmethod();  //without mentioning abstract keyword for method & interface it automatically takes as abstract methods
}

*/




/*

//abs-2
abstract class AbstractVsInterfaceDifferences
{
	abstract void method();  //abstract method not having any body & abstract class contains abstract methods
	
	void instancemethod()
	{
		System.out.println("abstract class can contain instance methods/concrete methods");
	}
	
	static void staicmethod()
	{
		System.out.println("abstract class can contain static methods");
	}	
}

*/



/*
//int-2
interface AbstractVsInterfaceDiffernces
{
	void iamabstractMethod();    // interface will contain only abstract methods which are instance methods	
	
	void nonabstractmethod()
	{
	
	}
	
	void instancemethods()
	{
	
	}

*/


/*
//abs-3
//Declaring an abstract method with abstract keyword in an abstract class is mandatory.

class AbstractVsInterfaceDifferences
{
	abstract void  method();
	void concretemethod()
	{
	
	}
}

*/


/*
//int-3
interface AbstractVsInterfaceDiffernces 
{
	void abstractmethod();  //without mentioning abstract keyword for method & interface it automatically takes as abstract methods
}

*/




/*
//abs - 4   The members of an abstract class can be either public or non public

abstract class  AbstractVsInterfaceDifferences
{

	public abstract void  abstractmethod();
	
	protected abstract void abstractmethod1();
	
	//private abstract void abstractmethod2();   // based on class and method private<default<protected<public  - so it gives error 
	
	abstract void abstractmethod3(); //default modifier is also accepter
	
	void norm()    //we can keeep default/protected/public 
	{
		
	}	
}

*/

/*
// int-4   The members of an interface will be only public (it is default written by compiler)

interface AbstractVsInterfaceDifferences
{
	public void method();
	
	//protected void m2();
	//private void m3();
	// void m4();     //it dont understand as a default modifier, the compiler understand like this - public abstract void m4(); so No Exception

}

*/



/*
//abs-5 The value of the variables in an abstract class can be modified or fixed.

abstract class AbstractVsInterfaceDifferences
{
	final int a=5;  //abstract class variable can be fixed by using final keyword
	int j=45;       //abstract class variable can be modified by using without final keyword
	
	final void m1()   //abstract class can contain final methods(14)
	{
	
	}

}

*/

/*
// interface -5

interface AbstractVsInterfaceDifferences
{
	int min=5;                      //---> public static final int min=5; 
	 void print();                   //---> public  abstract void print();

//	final void m1()   //interface cannot contain final methods(14) becz there implementation must be done by others.
//	{
//	
//	}
	 
}
  
 //The Java compiler adds public and abstract keywords before the interface
 //method. Moreover, it adds public, static and final keywords before data members.
 // The value of the variables in an interface cannot be modified becz they are by default fixed

*/





/*
//abs-6

abstract class AbstractVsInterfaceDifferences
{
  int var1=399;
  static float var2=45.34f;    // abstract class can have both instance variables and static variables
	
}

*/

/*
//int-6
interface AbstractVsInterfaceDifferences
{
	int min=5;                      //---> public static final int min=5;
									//compiler adds public, static and final keywords before data members.
}

*/


/*

//abs-7
abstract class AbstractVsInterfaceDifferences
{
	AbstractVsInterfaceDifferences()
	{
		  System.out.println("An abstract class will contain a constructor whether we specify or not");
	}
	
}
*/



/*
//int-7
interface AbstractVsInterfaceDifferences
{
//	AbstractVsInterfaceDifferences()   //interface cannot have any constructor
//	{
//	System.out.println("interface cnnot instantiated automatically so we r not allowed to write an constructor");
//	}
}

*/



/*

//abs-8 An abstract class can be inherited into a class by using extends keyword

class normal extends AbstractVsInterfaceDifferences  
{
	
}

*/



/*
//int-8 An interface can be inherited into a class by using implements keyword.
class normal implements  AbstractVsInterfaceDifferences
{
	
}

*/




/*

//abs-9&10 An abstract class can extend at most one class & using abstract class we cannnot achieve multiple inheritance
class normal1
{
	
}
class normal2
{
	
}
abstract class AbstractVsInterfaceDifferences extends normal1  //,normal2
{
	
}

*/


/*
//int-9&10  An interface we can achieve multiple inheritance & using interface we can achieve multiple inheritance

interface one
{
	
}

interface two
{
	
}

interface three
{
	
}

interface main extends one,two,three
{
	
}


*/



/*

//abs-11 Using abstract class we cannot achieve multiple inheritance

interface one
{
	
}

interface two
{
	
}
abstract class AbstractVsInterfaceDifferences implements one,two 
{
	
}


*/



/*
//int-11 An interface cannot be implement any interface (An interface can extend any interface)

//class Vs class            --->extends
//class Vs interface        ---> implements
//interface Vs interface    ---> extends

interface two
{
	
}

interface three
{
	
}

interface main implements two,three
{
	
}


*/













































































































































