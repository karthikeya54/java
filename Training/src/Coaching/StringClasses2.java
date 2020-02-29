package Coaching;

public class StringClasses2 {

	public static void main(String[] args) 
	{
	
//	String s1=new String("spring");
//	s1.concat("fall");
//	String s2=s1.concat("winter");
//	s2.concat("summer");
//	System.out.println(s1);
//	System.out.println(s2);
		
		String s1=new String("you cannot change me");
		String s2=new String("you cannot change me");
		
		System.out.println(s1==s2);  //false, becz (s1 & s2) refernces wil be create in heap, one(copy) object wil create in scp
		
		String s3="you cannot change me";  //it creates in scp only,but
		System.out.println(s1==s3);        // s1 object reference is at heap & s3 object reference wil be at scp, references are differnt so it False.
		
		String s4="you cannot change me";   //it creates in scp only,but
		System.out.println(s3==s4);         //it already one object created with same content(while s1), now it wont create duplicate it points to old scp object, so refernce of s3 and s4 are at scp only it is True. 
		
		String s5="you cannot "+"change me"; //This concatination wil be done at compile time only becz both are strings(not variables)
		System.out.println(s4==s5);   //So s5 also points to the old scp reference(s1), so it is TRUE
		
		String s6="you cannot";     //s6 is a string literal it creates in scp only
		String s7=s6+"change me";   // one variable and one string literal concationation wil be done at run time so s7 wil create an object at heap also
		System.out.println(s4==s7);  //s4 object is at scp & s7 object is at scp, So both references are at different positions it wil be False
		
		final String s8="you cannot ";   //final means it wont be change, s8 object will point to old s6 object in scp
		String s9=s8+"change me";       //s8 is also a constant(but not a vairbale), So this operation will be performed at compile time only(it concatinates and assign to s9) s9 points to old s1 object
		System.out.println(s4==s9);    //s4 object & s9 object both points to same reference so it is TRUE
		
		
		
	}

}
