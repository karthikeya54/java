package AllinOne;

/*

//In this we covered single inheritance and Method OverRiding(with 5 differences)(classes - interit Vs two)


class interit
{
	final int rollnum=109;
	 float marks=67;
	 static int var=34;
	protected String name="karthik";
	
	static	 int methodOverRiding()  //when we write final keyword before method, we canot do any implemention in child class. //In methodOverRiding parent 
	{             //both child and parent methodOverRiding, can have static special keyword, we cannot change static keyword(i.e parent-> static to child-> non-static, i.e c->non-static to p->static we cant change like this)
		
		System.out.printlnn("This is method Overriding from parent class");
		
		return 34;
	}
	
}

class two extends interit  //single inheritance
{
protected	String t="two";  //protected means 
public	float s=34.345f;
	
protected 	void othermethod() 
	{
		System.out.printlnn("heloooo this is method from two");
	}

														
public	final static  int methodOverRiding()   //Acess Modifiers in methodOverRiding is in this order private<default<protected<public (more than parent class, we should implement acspecfier in child class)
	{                                  //So, in parent we have default AM for methodOverRiding(), so we can keep default/protedted/public, but not private becz private < default)
										//override a non-final method as ‘final’. & both parent and child should hve static / both should have non-static (wt ever child clas parent hve child should also f
		System.out.printlnn("wht ever the parent clas hve by default availble in child class,but child is not satisfied with parent class implementation, child is overriding now this is called methodOverRiding");
		
		return 1234;       //????is this correct
	}
	
public static void main(String[] args) {
		
	int mdovriding;
		two x=new two();
		System.out.printlnn("this is rol from interit class by default keyword"+x.rollnum);
		System.out.printlnn(x.t);
		System.out.printlnn(x.s);
		System.out.printlnn("This is an static variable belongs to class not an object "+interit.var);  //we can call x.var also no problem
		System.out.printlnn("we can call by instatnce variable also"+x.var); //it will rise an warning that we should call only by classname.variablename
		mdovriding=x.methodOverRiding(); //The value we r getting from child class only(implementation is changed by child so return value and data wil be changed in child = methodOverRinding)
		System.out.printlnn(mdovriding); 


}

}


//Covered with multi-level(classes - interit Vs two Vs Oops) Inheritance and Interface concept(implements with inter1+inter2=inter3)
//Covered with Constructor and with Constructor overloading
public class Oops extends two implements inter3 //multi-level inheritance //MUltiple Interface by implemets (inter3=inter + inter2) we cn write implemetns inter1,inter2,inter3 also no error,becz down we extended inter3 extends inter,inter2(if we r not extending this we should write implements inter,inter2,inter3. 
{
	
	int k=343;
	
	void kaki()
	{
		System.out.printlnn("this is normal method");
	}
	
	
	
	Oops()
	{
		System.out.printlnn("This is a constructor when ever an object is called special method(which is like class name) that wil be called automatically ");
	}
	
	Oops(String k,int age)
	{
		System.out.printlnn("but this is constructor overloading my name is, "+k+"my age is "+age);
	}
	
	
	
	
	public void interfaceMethods1()
	{
		System.out.printlnn("iam implementing the implentation in class oops from interface class by using implements keyword");
		System.out.printlnn("when we are implementing the method we should have to keep public ");
	}

	public void onlyAbstMethodsAllowed()
	{
	System.out.printlnn("IN interfaces only abstract methods are allowed wt ever methods we write in interfaces with/without abstract keyword it recognize as abstract methods");

	System.out.printlnn("when ever we r implementing all abstract methods in other class only the error wil be gone(once coment this method)");
	}
	
	public void interfaceMethods2()
	{
	System.out.printlnn("one class can implements multiple interface, but class cant extend more than one class");
	}

	public void onlyAbstMethodsAllowed2()
	{
	System.out.printlnn("hello");
	}

	public void interfaceMethods3()
	{
	System.out.printlnn("this is implementation from third interface ");
	}

	public void onlyAbstMethodsAllowed3()
	{

	System.out.printlnn("hello 3333");

	}
	
	public static void main(String ar[])
	{
	Oops s=new Oops();
	s.kaki();
	
	Oops q=new Oops("karthik",24);
	
	System.out.printlnn(s.rollnum);
	System.out.printlnn(s.marks);
	System.out.printlnn(s.name);
	System.out.printlnn(s.t);
	System.out.printlnn(s.s);
	
	System.out.printlnn("\n");
	
	two w=new Oops();
	w.othermethod();
	s.interfaceMethods1();
	s.onlyAbstMethodsAllowed();
	
	s.interfaceMethods2();
	s.onlyAbstMethodsAllowed2();
	
	s.interfaceMethods3();
	s.onlyAbstMethodsAllowed3();
	}
	}


	interface inter 
	{
	int num=5799;  //In interfaces java compiler understands like as automatically it recognises as variable as public static final int num=5799;
	
	void interfaceMethods1();  //for interfaces automatically it recognises a method as public abstract void interfaceMethods1() 
	void onlyAbstMethodsAllowed();
//	void notAllowedNormalMethods()
//	{
//		System.out.printlnn("IN interfaces only abstract methods(without body only) are allowed wt ever methods we write in interfaces with/without abstract keyword it recognize as abstract methods");
//		
//	}

}

	interface inter2 
	{
	int num=34;
	
	void interfaceMethods2();
	void onlyAbstMethodsAllowed2();
	}
 
	interface inter3 extends inter,inter2  //one interface can extends multiple interfaces, but one interface cant extends/implements a class ---??? is this correct
	{
	float k=344.45f;
	
	void interfaceMethods3();
	void onlyAbstMethodsAllowed3();
	}


	
*/	
	



/*

//Execution of Both static and instatnce blocks
class Oops
{
	int nonstaticvarible=45;
	static float staticvariable1=34.6455f;
	static {
		System.out.printlnn("static block 1");
		staticMethod();
		System.out.printlnn("static variable value is "+staticvariable1);
	}
	
	{
		nonStaticmethod();
		System.out.printlnn("Instance BLock 1");
	}
	
	public void nonStaticmethod()
	{
		System.out.printlnn("Iam non-staticmethod,becz no static keyword for method name");
	}
	
	Oops()
	{
		System.out.printlnn("Sample Zero Constructor");
	}
	
	Oops(int x)
	{
		System.out.printlnn("Sample one Constructor"+x);
	}
	
	public static void main(String[] args) {
		System.out.printlnn("Sameple main Method");
		Oops si=new Oops();
		System.out.printlnn(si.nonstaticvarible);
		
		System.out.printlnn(si.staticvariable1);
		
		
		Oops si2=new Oops(45);
	}
	
	{
		System.out.printlnn("Instance Block 2");
	}
	
	 static void staticMethod()
	{
		 
		System.out.printlnn("iam staticmethod becz iam hving static special keyword before method");
	}
	
	static {
		
		System.out.printlnn("static block 2");
	}
	static {
		System.out.printlnn("static block 3");
	}
}


// 1) first preference for static
//when a class is loaded, the jvm will go to the beginning of the class and search for static variables and static blocks in sequence from top to bottom.
//ONce the memory for all static variables is allocated and all static blocks are executed then the jvm search for main method & begins with execution of main()

// 2) second preference for instance

//When an object is created, then JVM will go to begining of the class and search for instance variables and instance blocks in sequence frm top to bottom
//Once the memory for all the instance variables is allocated and all the instance blocks are executed then, the JVM willl executed the constructor that is specified...

//Conclusion -> enters into class -> checks static variables,static blocks, main() -> IN main() we create an refvar(objectcreation), so it checks instance variables,instance blocks... 



*/


class Oops 
{

	public static void main(String[] args) {
		
		try
		{
		System.out.println("1st line");
		System.out.println("file open");
		System.out.println(10/0);
		
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("exception is raised automatically"+e);
		}
		
	finally
	{
		System.out.println("skjdflsdjfl");
	}
		
		
	}
}

































