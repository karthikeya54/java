package Coaching;





public class StringClasses 
{
	public static void main(String[] args) 
	{
				
		// Difference b/w mutable Vs Immutable 
		
//		String s=new String("karthik");
//		s.concat("kanamarlapudi");
//		System.out.println("string is an immutable "+s);

		
//		String ss=new String("Deva");
//		//ss.concat("kanamarlapudi"); //string is an immutable(non-changable behaviour) so it wont concat the content
//		System.out.println(ss);  
//		ss.concat("Teja");
//		System.out.println(ss);  
   
		
//		StringBuffer sb=new StringBuffer("karthikeya");
//		sb.append("kanamarlapudi"); //StringBuffer is mutable(changable behaviour) so it can be append the content will be added
//		System.out.println(sb);
//		//Once we created a buffer object, we can perform any type of changes in existing object because StringBuffer onjects are changable(mutable)
		
//		String f="Raja";
//		f.concat("Deva");
//		System.out.println(f);  
		
		//Difference b/w == Vs .equals();
		
				
//		String s=new String("karthik");
//		String s1=new String("karthik");
//		System.out.println(s==s1);    //== meant for reference comparision, here both are different loactions of storing ther objects so it is False
//		System.out.println(s.equals(s1)); //.equals() is mean for ref comparision as of object class, but in String class it is meant for content comparision it is overriden to content comparision so it is True(when content is same


//		StringBuffer s2=new StringBuffer("karthik");
//		StringBuffer s3=new StringBuffer("karthik");
//		System.out.println(s2==s3);  //anywhere == belongs to reference comparision here both are in different locations of storing there objects so it is False
//		System.out.println(s2.equals(s3)); //in StringBuffer .equals method is for reference comparision it is not overriden(not for content comparision) default coming from parent object class only it is False
		

//		String s5="karthik";
//		String s6="karthik";
//		System.out.println(s5==s6); //normally normal "" String wil be stored in StringConstantPool, s5 creates object in scp as karthik,if s6 also with same content it points out to before object only, so both references are same it is True
//		System.out.println(s5.equals(s6)); //In String concept .equals() is overriden from refernce comparision to content comparision so now the content is same it is definatly it is True
		
	}

}





//Rule:  When the string objects are compared by using equals(), then it will compare the 
         //contents of the string objects and 
//if we compare the string objects by using == operator, then it will compare the references(hashcodes) 
      //of the objects.


/*
class StringClasses  
{
            
	public static void main(String[] args)
	
	{
	String s1 = new String("hello");
	String s2 = new String("hello");
	String s3 = "hello";
	String s4 = "hello";
	System.out.println(s1.equals(s2));
	System.out.println(s1.equals(s3));
	System.out.println(s3.equals(s4));
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	System.out.println(s1==s4);
       }
}



*/