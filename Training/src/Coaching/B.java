package Coaching;

public class B extends A{

	 int a=45;
	  void m2()
	{
		System.out.println("this is m2() in class B");
	}
	
	public static void main(String[] args) {
		
		B bb=new B();
		bb.m2();
		bb.m1();
		System.out.println(bb.a);
		System.out.println(bb.j);
		A aa=new A();
		aa.m1();
		System.out.println(aa.j);
		
	}

}


//variables or methods  are in default - then within the same package(class-A,class-B) those variables/methods are accessible/visible.(it can be done with parent or child instantion is possible)
//									if its outside of the package (class-c,class-A)those variables/methods are not accessible/visible.(it cant be done with parent or child instantion also) 		



//variables or methods are in protected - then within the same package (class-A,class-B) those variables/methods are accessible/visible.((it can be done with parent or child instantion is possible))
//variables or methods are in protected - if itsin the outside of the package(class-c,class-A) those variables/methods are accessible in child instantion, but not in parent instantiation.