package Coaching;


class Tathaya
{
	int r=34;
	float e=34.3f;
	
	void t()
	{
		System.out.println("Thatha asthi");
	}
}


class Nanna extends Tathaya
{
	int money=434;
	String d="nanna";
	int r=4534;
	
	void nana()
	{
		System.out.println("This is nann developed");
		System.out.println(r);  //4534
		System.out.println(super.r);  //34
	
	
	}

	public static void main(String[] args) {
		
		Nanna n=new Nanna();
		//System.out.println(n.);
		n.nana();
		
	}
	
	
}













public class Deva 
{
	
void f()
	{
		System.out.println("kjdsflkj");
	}
	public static void main(String[] args) 
	{
		Deva d=new Deva();
		d.t();
		System.out.println(d.e);
		System.out.println(d.r);
		d.f();
		
		d.nana();
		System.out.println(d.r);
		System.out.println(d.money);
	}

}
