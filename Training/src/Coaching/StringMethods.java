package Coaching;

import java.util.Scanner;


/*

// boolean equals(Objects):  This method can be used to compare the contents of the string objects by considering their case.
//	boolean equalslgnorecase(String):  This method can be used to compare the content of the  string objects by ignoring their case.
public class StringMethods {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the user name");
		String name=sc.next();
		
		System.out.println(" My name is "+name);

		System.out.println(name.equals("karthik"));
		System.out.println(name.equalsIgnoreCase("KARTHIK"));
		
		
		String s1 = new String("abc");
		String s2 = new String("ABC");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		
		}

}


*/





/*

//	int length():  This method will return the count of the number of characters available in a String.

class StringMethods  
{
public static void main (String[] args)   
{
String str = new String(" java program");
System.out.println (str.length());
}
}

*/





/*
//chat charAt(int index):  This method will return a character that is available at the specified index position.
//The index position starts from 0. If the specified index is not within the range then, it will generate a runtime error called StringIndexOutOfBoundsException.


class StringMethods  
{
public static void main (String[] args)   
{

String str = new String("java program");
System.out.println(str.charAt(5));
//System.out.println(str.charAt(15));
}
}

*/


/*

//Rule:  If both the operands are of numeric type then + operator will perform addition 
//and if atleast one operand is of string type then + operator will perform concatenation.

class StringMethods    {
          public static void main(String[] args)    {
	String str = new String("hello");
	System.out.println(str+1+2+2);
	System.out.println(1+str+2+3);
	System.out.println(1+2+str+3);
	System.out.println(1+2+3);
	System.out.println(1+2+str+3);
	System.out.println(1+str+(2+3));
     }
}

*/




/*

// String concat(String):  This method can be used to append the contents of one string to another string.

class StringMethods  
{
public static void main (String[] args)   
{

String s1 = new String("java");
String s2 = new String("program");
s1 = s1.concat (s2);
System.out.println(s1);
System.out.println(s2);

}
}


*/



/*

//	int compareTolgnoreCase(String):   This method can be used to compare the unicode values of the characters available in a String by ignoring their case.  This method is designed for sorting the strings.

class StringMethods  
{
public static void main (String[] args)   
{

	String s1 = new String("abc");
	String s2 = new String("bcd");
	String s3 = new String("abc");
	String s4 = new String("bcd");
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.compareToIgnoreCase(s2));

	System.out.println(s1.compareTo(s3));
	System.out.println(s2.compareToIgnoreCase(s4));

}
}


*/




/*

//	boolean starts With(string):  This method can be used to check whether a string begins with a specified group of characters or not.
//	boolean endsWith(String):  This method can be used to check whether a string end with a specified group of characters or not.

//Note:  The startsWith() and ends With() will consider the case.


class StringMethods  
{
public static void main (String[] args)   
{

String str = new String("java program");
System.out.println(str.startsWith("ja"));
System.out.println(str.startsWith("jab"));
System.out.println(str.startsWith("JAVA"));
System.out.println(str.endsWith("ram"));
System.out.println(str.endsWith("Gram"));

}

}


*/






/*

// int indexOf(char):  This method will return the index of the first occurrence of the specified character.
//	int lastIndexOf:  This method will return the index of the last occurrence of the specified character.
//Note:  The indexOf() and lastIndexOf() will return-1, if the specified character is not available.

class StringMethods  
{
public static void main (String[] args)   
{
String str = new String ("java program");
System.out.println(str.indexOf('a'));
System.out.println(str.indexOf('p'));
System.out.println(str.indexOf('q'));   //specified charachter is not available
System.out.println(str.lastIndexOf('a'));
System.out.println(str.lastIndexOf('p'));
System.out.println(str.lastIndexOf('z'));

String s="babbab";
System.out.println(s.lastIndexOf('a'));


}

}

*/







/*

//String replace(char old, char new):  This method can be used to replace all the occurrencess of the specified character with a new character.

class StringMethods  
{
public static void main (String[] args)   
{

String str = new String("java jug jar jungle");
System.out.println(str.replace('j', 'b'));

String s="babbab";
System.out.println(s.replace('b','a'));

}

}


*/





/*
//	String substring(int index):  This method will return a group of characters beginning from the specified index position to the end of the string.
//	String substring(int index, in offset):  This method will return a group of characters beginning from the specified index position up to the specified offset.

//Note:  The offset represents the position of a character in a string and it begins with 1.


class StringMethods  
{
public static void main (String[] args)   
{

String str = new String("java program");
System.out.println(str.substring(3));
System.out.println(str.substring (2,9));  

}

}

*/



/*

// String toLowerCase():  This method will convert the contents of a string to completely lower case.
// String toUpperCase():  This method will concert the contents of a string to completely upper case.

class StringMethods  
{
public static void main (String[] args)   
{

String str = new String ("java program");
System.out.println(str);
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());

}

}

*/






/*

//String trim():  This method can be used to remove the leading and trialing spaces available in a string
//trim() wont remove blanck spaces at middle of the string
class StringMethods  
{
public static void main (String[] args)   
{
String str = new String("    java program   ");
System.out.println(str+"bye");              // not using trim command
System.out.println(str.trim()+"   bye");    // when we use trim command it trims starting and ending
}
}


*/








/*

//	String intern():  This method will refer to an object available in string constant pool which was created ar the time of object creation in heap memory.
class StringMethods  
{
public static void main (String[] args)   
{

String s1 = new String("hello");
String s2 = s1.intern();
System.out.println(s1);
System.out.println(s2);
}
}

*/



/*
//using trim() after finding out the length of the String
class StringMethods
{
	public static void main(String[] args) 
	{
	
		String s="OMKARS COMPUTER EDUCATION";
		System.out.println(s.length());
		System.out.println(s.trim().length());   
		
	}
}

*/


/*


class StringMethods
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Guntur \n2.vijayawada\n3.tirupati");
		System.out.println("Enter your city name: ");
		String name=sc.nextLine();
		
		if(name.equals("Guntur"))
		{
			System.out.println("Welcome to  Guntur OMKARS COMPUTER EDUCATION,,,,");
		}
		
		else if(name.equals("vijayawada"))
		{
			System.out.println(" Durgamma Temple ");
		}
		
		else if(name.equals("tirupati"))
		{
			System.out.println(" Venkanna Balaji Swamyyy ");
		}
				
		else
		{
			System.out.println("please enter valid city name");
		}
		
	}
}


*/


/*

class StringMethods
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.guntur \n2.vijayawada\n3.tirupati");
		System.out.println("Enter your city name: ");
		String name=sc.nextLine().toLowerCase().trim();
		
		if(name.equals("guntur"))
		{
			System.out.println("Welcome to  Guntur OMKARS COMPUTER EDUCATION,,,,");
		}
		
		else if(name.equals("vijayawada"))
		{
			System.out.println(" Durgamma Temple ");
		}
		
		else if(name.equals("tirupati"))
		{
			System.out.println(" Venkanna Balaji Swamyyy ");
		}
				
		else
		{
			System.out.println("please enter valid city name");
		}
		
	}
}




*/







/*

//Chainging of Methods
class StringMethods
{
	public static void main(String[] args) {
		
		
		String st=new String("java");
		System.out.println(st.concat("program").substring(3).concat("example").substring(4,12).concat("test").replace('e','n').toUpperCase().charAt(4));
	}
}


*/




/*

//when we are calling runtime method Is there any change in the content
//Rule: create an object give the reference variable to the new object, no change in the content existing object only it will be re-used

class StringMethods
{
	public static void main(String[] args) {
		String s1=new String("omkars");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
	}
}


*/



/*

class StringMethods
{
	public static void main(String[] args) {
		
		String s1="omkars";
		String s2=s1.toString();
		String s3=s1.toLowerCase();
		String s4=s1.toUpperCase();
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
	}
}





//String toString(); , so existing object only wil be re-used
//String toLowerCase(); so no change in content, so existing object only wil be re-used
//String toUpperCase(); creates new object, becz of runtime operation in heap area, but not in scp

//NOTE: Once we create an String Object, we are not allowd to take change in that object, 
    // if we are trying to perform any changes (if there is change in content) with those changes a new object will be created...

// If there is No Change in content exisisting object only wil be reused.(Whether exisiting object present in heap area/scp area) 


*/



/*

// Creation of  an own  immutable class  ( its in Test.java file run on that file)

class Test
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

 
*/


/*

// Proof Difference b/w final Vs immutability

class StringMethods
{
	public static void main(String[] args) 
	{
		final StringBuffer sb=new StringBuffer("omkars");
		sb.append("computer education");     //this is immutablity by using StringBuffer
		System.out.println(sb);
		
	}
}

//Normally StringBuffer means mutability, we are declaring final keywor,but the content is changing in exisiting object only
//So, by declaring refernce variable as final we are not able to get imutablity nature final is differnt concept and immutable is differnt concept


*/


/*

// The use of final keyword for a variable is we cant re-assign that ref variable to any new object
class StringMethods
{
	public static void main(String[] args) 
	{
		final StringBuffer sb=new StringBuffer("omkars");  //we declared final keyword
		sb.append("computer education");   
		System.out.println(sb);
		//sb=new StringBuffer("Brodipet");  //final variable cant re-assing its value
		
	}
}


//if we dont want perform the re-assignment for variable we use  ---> final  (final talks about variable but not object)
//if we dont want to perform any changes in the object then it is ---> immutability (immutability talks about object)


*/


/*

Which are the following are meaningfull words???

final variable      - yes
final object        - NO
Immutable variable  - NO
Immutable object    - NO


 */





/*
//string api methods

public class StringMethods
{
	
	public static void main(String[] args) {
		String ta="A";
		ta=ta.concat("B");
		
		String tb="C";
		ta=ta.concat(tb);
		
		ta.replace('c','D');  //caution 
		ta=ta.concat(tb);
		
		System.out.println(ta);
	}
}

*/



/*
public class StringMethods
{
	public static void main(String[] args) {
		
		String str=" ";
		//System.out.println(str.length());
		str.trim();   //caution
		
		System.out.println(str.equals("")+"  "+str.isEmpty());
	}
}

//String objects are immutable - means once we created an string object, we cant perform any changes in existing object.if we tried to change it creates an new object wil be created that is called immutablity
//trim(); - means it removes blank spaces at begining of the string and ending of the string not at middle
//str.trim(); is not holding any refernce variable so it is allowd for GC.(a new object will be created and existing object wont be changed)

*/



/*
class StringMethods
{
	public static void main(String[] args) {
	
		String s="omkars computer";
		int len=s.trim().length();
		
		System.out.println(len);
	}
	
}

*/


/*
class StringMethods
{
	public static void main(String[] args) {
	
		String s="omkars computer";
		s.trim();
		int i=s.indexOf(" ");
		
		System.out.println(i);
	}
	
}

*/







/*
//Consider the following code:

public class StringMethods
{
	
	public static void main(String[] args) {
		
		String s1="Java";
		String s2=new String("java");
		
		//Line-1 //which code should be keep here to get equal
		
		{
			
			System.out.println("equal");
		}
		
		else
		{
			System.out.println("NOt equal");
		}
		
	}
}

*/

/*
// To print "equal", which code should be inserted at Line-1

a) String s3=s2;  //In s3 also points to the same referencee of s2, but s1 and s3 references are not same
   if(s1==s3)
	   
b) if(s1.equalsIgnoreCase(s2))  //equalsIgnoreCase means it compares only the content & ignores the case content,but not refernces
	
c) String s3=s2;
   if(s1.equals(s3))  //.equals() in string means it is for content comparision, here it worries about the case
	   
d) if(s1.toLowerCase()==s2.toLowerCase())  // when ever s1.toLowerCase() is applied s1 content wil convert into lowercase & it creates in new object s1 is at heap area & s2 is at scp so == means reference, both r at differnt refernces so its FAlse

*/






















































