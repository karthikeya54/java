package Collections;

import Coaching.B;
import Coaching.A;

public class C extends A {

	void m3()
	{
		System.out.println("this is m3 method");
	}
	public static void main(String[] args) 
	{
	C cc=new C();
	cc.m3();
	cc.m1();

	System.out.println(cc.j);
	
	A a=new A();
	a.m1();
	System.out.println(a.j);

	}

}
