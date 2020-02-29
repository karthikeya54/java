package Coaching;

/*
Abstract class in Java
A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.

*/




/*


abstract class Car
{  
  abstract void run();   //A method which is declared as abstract and does not have implementation is known as an abstract method.
}  
class AbstractClass extends Car
{  
void run()
{
System.out.println("Car speed is higher than bike");
}  
public static void main(String args[])
{  
AbstractClass obj = new AbstractClass();  
 obj.run();  
}  
}  



*/


/*
abstract class Shape
{  
abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape
{  
void draw()
{
	System.out.println("drawing rectangle");
	}  
}  
class Circle1 extends Shape
{  
void draw()
{
	System.out.println("drawing circle");
}  
}  
//In real scenario, method is called by programmer or user  
class AbstractClass
{  
public static void main(String args[])
{  
	
	//Shape s=new Shape();    //cannot instantiate this abstract class becz we can have abstract methods 
	Shape s1=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
	s1.draw();  
	
	Shape s2=new Rectangle();
	s2.draw();
	
	
}  
}  


*/






/*

abstract class Bank
{    
abstract int getRateOfInterest();    
}    
class SBI extends Bank
{    
int getRateOfInterest()
{
return 7;
}    
}    
class Yes extends Bank
{    
int getRateOfInterest()
{
return 8;
}    
}    
    
class AbstractClass
{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest of Sbi bank is: "+b.getRateOfInterest()+" %");    
b=new Yes();  
System.out.println("Rate of Interest of Yes bank  is: "+b.getRateOfInterest()+" %");    
}
}    


*/

/*
abstract class Operation  
{
    void msg() 
    {
	System.out.println("hello friends");
    }
    abstract void twice(int a);
}
class Programmer1 extends Operation  
{
     void twice(int x) 
     {
	System.out.println("result1 : "+(x+x));
      }
}
class Programmer2 extends Operation  
{
      void twice(int y) 
      {
	System.out.println("result2 :"+ (y*2));
       }
}
class Programmer3 extends Operation  
{
     void twice(int z)    
     {
	System.out.println("result3 : "+ (z*3));
     }
}
class AbstractClass   
{
      public static void main(String[] args)   
      {
	Programmer1 p1 = new Programmer1();
	p1.msg();
	p1.twice(5);
	
	Programmer2 p2 = new Programmer2();
	p2.msg();
	p2.twice(6);

	Programmer3 p3 = new Programmer3();
	p3.msg();
	p3.twice(7);        }
}

*/



/*

//Abstract class having constructor, data member and methods
//An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.
//Example of an abstract class that has abstract and non-abstract methods  
abstract class Bike
{  
 Bike()
 {
	 System.out.println("bike class is created by the constructor iam running when ever object is created ");
	 }  
 abstract void run();  
 void changeGear()
 {
	 System.out.println("gear changed");
 }  
}  
//Creating a Child class which inherits Abstract class  
class Honda extends Bike
{  
void run()
{
	System.out.println("running safely..");
}  
}  
//Creating a Test class which calls abstract and non-abstract methods  
class AbstractClass
{  
public static void main(String args[])
{  
Bike obj = new Honda();  
obj.run();  
obj.changeGear();  
}  
}  



*/




//Rule: If there is an abstract method in a class, that class must be abstract.




//abstract class in inherited to an normal(non-abstract class)

/*
abstract class Shape  {
    int dim1, dim2;
    Shape(int dim1, int dim2)   {
	this.dim1 = dim1;
	this.dim2 = dim2;
    }
     abstract double area();
}
class Rectangle extends Shape  {
    Rectangle(int length, int breadth)  {
          super(length, breadth);
    }
    double area()   {
          return dim1 * dim2;
    }
}


class Triangle extends Shape 
{
     Triangle(int base, int height)   
     {
	super(base, height);
      }
      double area() 
      {
  	return 0.5 * dim1 * dim2;
      }
}

class AbstractClass  
{
	public static void main(String[] args) 
	{
	
		Shape s;
		s = new Rectangle(3,4);
		double res = s.area();
		System.out.println("Rectangle area : "+res);
		s = new Triangle(5,6);
		res = s.area();
		System.out.println("Triangle area : "+res);
}
 
}


*/










































