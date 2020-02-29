package package1;  

public class Car {

	public static final String color="Black";
	int mileage=20;
	
	protected void display()
	{
		System.out.println("Color: "+color+", Mileage : "+mileage);
	}

	public void ownerDetails()
	{
		System.out.println("This car is brought by:");
	}
	
	public static void main(String[] args) {
		
	new Car().display();

	
	}


}



//A class and interface we cannot make it as private, so members of this class should be visible, classes outside the package and acessible inside the packages we kept public AcessModifier. 

//final - we dont want to change the value

//protected says that the members(variables/methods) can be accessed by the classes, outside the package, if they are the subclass of this particular class.
//this particular method will be accessed only by the other classes available in package1 (or) by the clases in the other package wil be acesed this method if they are subclass of this class

