package package2;
import package1.Car;  //for importing import.packagename.classname;



public class Hyundai extends Car {  

	void hudaiMethod()
	{
		System.out.println("im hyundai matter");
	}
	
	
	
public static void main(String[] args) 
{
	Hyundai h1=new Hyundai();
	
	System.out.println("This is an Extandable class");
	h1.display();
	System.out.println("Color "+h1.color);
	
	
	
}
}


//protected - The particular protected method will be able to call / wil be called by its sub class which is in other package