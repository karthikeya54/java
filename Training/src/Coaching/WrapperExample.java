package Coaching;



/*
 
 when we want to store any data we use primitive datatypes., i.e., int,float,double,String,boolean.To store data...
 Java is purely object oriented programming Language .we are using primitives...so., we instead of using primitives,
 we should use some clases. For int, we have class called Integer 
 
 
 
 */

/*

public class WrapperExample {

	
	public static void main(String[] args) 
	{
		int a=5;    //primitive datatype(int) , primitive variable(a)
		Integer ref=new Integer("5"); //Integer(class) , ref(Referencevariable) //This is called Creation of Wrapper class
		
		System.out.println(ref); //The o/p wil be same but we are doing with objects
		System.out.println(a);   //The o/p wil be same but we are doing with primitive variable
		
		//See in the table we have so many wrapper classes...
		
		float f=45.34f;
		Float ff=new Float(45.34f); //1st way creation of wrapper class objects
		System.out.println("object type value is "+ff);
		
		Float fff=new Float(f);   //2nd way creation of wrapper class objects
		System.out.println("pass primitive variable to wrapper class"+fff);
		
		Float ob=new Float("45.34f"); //3rd way creation of wrapper class objects
		System.out.println("passing string(float) type is "+ob);
		
		
		//valueOf(); --> converting a value from primitive type (or) string type to wrapper type
		Integer kk=Integer.valueOf(a);   //1st model in valueOf();
		System.out.println(kk);
		Integer kkk=Integer.valueOf("55");  //2nd model in valueOf();
		System.out.println("converting a value from string type to wrapper type"+kkk);
		
		//xxxvalue();  ---> Converting a value from wrappper type to primitive type
		
		Integer x=Integer.valueOf(9393); 
		
		int i=x.intValue();
		System.out.println("converting value from wrapper type to primitive type"+i);
		
		float m=x.floatValue();
		System.out.println("converting vlaue from wrapper type to primitive type flaot" +m);
		
		Boolean b=new Boolean("TRUE");
		System.out.println(b);
		
		Boolean bB=new Boolean("FaLse");
		System.out.println(bB);
		
		
	}

}

*/

/*


Primitive Type			  Wrapper class
boolean						Boolean
char						Character
byte						Byte
short						Short
int							Integer
long						Long
float						Float
double						Double


*/




/*

public class WrapperExample{  
public static void main(String args[]){  
byte b=10;  
short s=20;  
int i=30;  
long l=40;  
float f=50.0F;  
double d=60.0D;  
char c='a';  
boolean b2=true;  
  
//Autoboxing: Converting primitives into objects  
Byte byteobj=b;  
Short shortobj=s;  
Integer intobj=i;  
Long longobj=l;  
Float floatobj=f;  
Double doubleobj=d;  
Character charobj=c;  
Boolean boolobj=b2;  
  
//Printing objects  
System.out.println("---Printing object values---");  
System.out.println("Byte object: "+byteobj);  
System.out.println("Short object: "+shortobj);  
System.out.println("Integer object: "+intobj);  
System.out.println("Long object: "+longobj);  
System.out.println("Float object: "+floatobj);  
System.out.println("Double object: "+doubleobj);  
System.out.println("Character object: "+charobj);  
System.out.println("Boolean object: "+boolobj);  
  
//Unboxing: Converting Objects to Primitives  
byte bytevalue=byteobj;  
short shortvalue=shortobj;  
int intvalue=intobj;  
long longvalue=longobj;  
float floatvalue=floatobj;  
double doublevalue=doubleobj;  
char charvalue=charobj;  
boolean boolvalue=boolobj;  
  
//Printing primitives  
System.out.println("---Printing primitive values---");  
System.out.println("byte value: "+bytevalue);  
System.out.println("short value: "+shortvalue);  
System.out.println("int value: "+intvalue);  
System.out.println("long value: "+longvalue);  
System.out.println("float value: "+floatvalue);  
System.out.println("double value: "+doublevalue);  
System.out.println("char value: "+charvalue);  
System.out.println("boolean value: "+boolvalue);  
}}  

*/