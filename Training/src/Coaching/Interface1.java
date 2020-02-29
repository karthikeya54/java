package Coaching;

/*
An interface in java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.



It cannot be instantiated just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.

Why use Java interface?
There are mainly three reasons to use interface. They are given below.

It is used to achieve abstraction.
By interface, we can support the functionality of multiple inheritance.
It can be used to achieve loose coupling.

*/


/*

Syntax:
interface <interface_name>{  
      
    // declare constant fields  
    // declare methods that abstract   
    // by default.  
}  

*/




/*
//just like single inheritance

interface Tom
{  
void cat();  
}  
class Interface1 implements Tom
{  
public void cat()
{
	System.out.println("Hello");
}  
  
public static void main(String args[])
{  
	Interface1 obj = new Interface1();  
obj.cat();  
 }  
}  


*/




/*
// Just like multiple inheritance

interface Sample  
{
    int x = 45;
    void msg();
}
interface Example 
{
    int y = 99;
    void msg();
}
class Interface1  implements Sample,Example  // A class can implements no.of interfaces
{
       public void msg()
       {
   System.out.println("multiple Inheritance");
    }
    public static void main(String[] args)  
    {
	System.out.println(x);
	System.out.println(y);
	Interface1 id = new Interface1();
	id.msg();
	Sample  s = new Interface1();
	s.msg();
	Example t = new Interface1();
	t.msg();
    }
}


*/


//NOTE: •	An interface can extends any number of interfaces.
//      •	A class can extends a class and implement any number of interfaces to gether at the same time (extends keyword should be followed by implements keyword).



/*

//multi-level to class implements interface
interface Printable
{  
void print();  
}  
interface Showable extends Printable
{  
void show();  
}  
class Interface1 implements Showable
{  
public void print()
{
	System.out.println("1st implementation from printable");
	}  
public void show()
{
	System.out.println("2nd implementation from showable");
	}  
  
public static void main(String args[])
{  
	Interface1 obj = new Interface1();  
obj.print();  
obj.show();  
 }  
}  


*/


/*
//just like as multi-level 2nd example
interface Bank
{  
float rateOfInterest();  
}  
class SBI implements Bank
{  
public float rateOfInterest()
{
	return 9.15f;
	}  
}  
class PNB implements Bank
{  
public float rateOfInterest()
{
	return 9.7f;
	}  
}  
class Interface1
{  
public static void main(String[] args)
{  
Bank b=new SBI();  
System.out.println("ROI: "+b.rateOfInterest());  
}
} 

*/





/*

//Its just like hierarichal inheritance (see the diagrams which u can understand clearly)
interface Drawable
{  
void draw();  
}  
  
class Rectangle implements Drawable
{  
public void draw()
{
	System.out.println("drawing rectangle");
	}  
}  
class Circle implements Drawable
{  
public void draw()
{
	System.out.println("drawing circle");
	}  
}  
  
class Interface1
{  
public static void main(String args[])
{  
Drawable d=new Circle();  
d.draw();  

Drawable r=new Rectangle();
r.draw();
}
}  



*/

/*
//hierarichal-2nd example

interface Animal  {
    void makeSound();
}
class Cat implements Animal  {
 public void makeSound()   {
	System.out.println("meow meow");
  }
}
class Dog implements Animal 
{
 public void makeSound() 
 {
	System.out.println("bow bow");
   }
}



class Interface1   {
   public static void main(String[] args)   {
	Cat c = new Cat();
	c.makeSound ();
	Dog d = new Dog ();
	d.makeSound ();
     }
}


*/












/*

//Since Java 8, we can have method body in interface. But we need to make it default method.

interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
class Interface1{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
d.msg();  
}}  

*/






/*

//Since Java 8, we can have static method in interface

interface Drawable{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
}  
  
class Interface1{  
public static void main(String args[]){  
Drawable d=new Rectangle();  
d.draw();  
System.out.println(Drawable.cube(3));  
}}  


*/






/*
 * Marked Interface(Tagged Interface): An interface is said to be marked or
 * tagged if it is empty i.e. if the interface does not have any members.
 * 
 * -->The purpose of a marked interface is to provide some instructions to the
 * JVM to perform a task in a special way.
 * 
 * Examples of predefined marked interfaces: Cloneable Serializable RandomAccess
 * etc.
 * 
 * Note: We can create user defined marked interface but they are of no use
 * because the JVM has no meaning for user defined marked interfaces.
 * 
 * 
 */












