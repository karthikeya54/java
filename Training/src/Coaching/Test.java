package Coaching;



/*

public class Test  {

	int voi;
	
	static int num1=4545;
	
	Test(int charan,int deva)
	{
		System.out.println("This is an constructor iam not calling explicitly, when ever object is created then it wil call me");
		System.out.println("charan value is "+charan+"deva value is"+deva);
	}
	
	
	void hello(int k)
	{
		System.out.println("this is normal method/function");
		System.out.println("testing ");
		System.out.println(k*5);
	}
	
	void raja()
	{
		System.out.println("yakub");
	}
	
	
	
	public static void main(String[] args) 
	{
		Test dev=new Test(10,28);
		Test k=new Test(45,34);
		k.hello(4);
		
		Test bot=new Test(56,345);
		System.out.println(dev.voi);
		System.out.println(k.voi);
		

	}

}


*/




// Creating an own immutable class 
final class Test
{
	
private int i;


Test(int i)
{
	this.i=i;
}

public Test modify(int i)
{
	 if(this.i==i)    //if the content is same it returns same
	 {
	 return this;
	 }

	 else
	 {                        //if we are performing any changes with a new object wil be created, but we cant change in exisiting object
	return new Test(i);   //if the content is not same it returns ( it creates an new object)
	 }
}



	public static void main(String[] args) 
	{
	 Test t1=new Test(10);
	 Test t2=t1.modify(100);
	 Test t3=t1.modify(10);
	  System.out.println(t1==t2);    // content is different in heap area(int i) , sp for t2  a new object creates
	  System.out.println(t1==t3);    //content is not different so it point outs exisiting object refernce only
}

}










