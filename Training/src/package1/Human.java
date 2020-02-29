package package1;

//import Coaching.Testing;
//public class Human extends Testing  // ????i cant extend Testing class Y???

public class Human 

{
	public static void main(String[] args) {
		
		String name="Karthik";
		Car h1=new Car();
		
	h1.display(); 					 //by extending other class only we can inherit those methods and variables from other class to this, so code reusablity provided.
		
		
		
		//doubt?    ,, if i tried to call display(); directly in human [In Car class display is protected,- means same package sub class it should come, but its not comming]
		//doubt?  if we r not extending Car class ,, iam not calling an method with h1.display(); X  , protected - same package non-subclass also it can acces?? 
		
		
//		h1.ownerDetails();
		System.out.println(name);
	}
}



//There are 2 classes in package1, So iam inheriting all properties from the other class by using extend keyword.

// Iam not doing any import because its in the same package
//If it is in different package, import packagename.filename;    