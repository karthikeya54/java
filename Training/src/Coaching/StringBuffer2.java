package Coaching;




//public int length();
//public int capacity();
//public char charAt(int index);
//public void setCharAt(int index,char newcharacter);
//public StringBuffer append(XXXX) //we have multiple StringBuffer  append methods
//public StringBuffer insert(int index,xxx)
//StringBuffer deleteCharAt(int beginindex,int endoffset)   //from begin to end-1
//StringBuffer deleteCharAt(int index)
//StringBuffer reverse() - this method can be used to reverse the contents of StringBuffer.
//public void setLength(int length)  - iam setting a particular length for a string
// public void ensureCapacity(int capacity) -- if we want to increase capacity dynamically

/*
//StringBuffer methods

public class StringBuffer2 {

	public static void main(String[] args) 
	{
			
		StringBuffer sb=new StringBuffer("omkars");
		System.out.println(sb.charAt(3));
		//System.out.println(sb.charAt(25));  //if we dont have that index it raises StringIndexOutOfBounds Exception but not StringBufferIndexOutOfBonds exception(there is no such exception)
		System.out.println(sb.length());        //present length of sb
		System.out.println(sb.capacity());    //16+how many characters we gave for sb
				
	}

}

*/



/*

public class StringBuffer2 {

	public static void main(String[] args) 
	{
			
		StringBuffer sb=new StringBuffer("omkars");
		
		sb.setCharAt(5, ' ');   //iam replacing at 5th index the space charachter
		System.out.println(sb);
				
	}

}


*/




/*
 
 //public StringBuffer append(XXXX) //we have multiple StringBuffer  append methods
public class StringBuffer2 {

	public static void main(String[] args) 
	{
			
		StringBuffer sb=new StringBuffer("omkars");
		
		sb.append(3.14+" ");
		sb.append("  it is string \n");
		sb.append(true);
		sb.
		System.out.println("StringBuffer accepts all string,boolean,int,char"+sb);
				
	}

}

*/




/*
//public StringBuffer insert(int index,xxx) - The methods can be used to insert the specified content at the specified index
//xxx - means multiple overloaded methods are available String,double,boolean,char

public class StringBuffer2 {

	public static void main(String[] args) 
	{
			
		StringBuffer sb=new StringBuffer("karthik");
		//System.out.println(sb.insert(offset, b));
		System.out.println(sb.insert(0, "jar"));
		System.out.println(sb.insert(4, 1.7));
	}
	
}

*/


/*

//StringBuffer deleteCharAt(int beginindex,int endoffset)   //from begin to end-1
//StringBuffer deleteCharAt(int index)


public class StringBuffer2
{
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("karthikeya");
		System.out.println(sb1.delete(2, 5));
		
		StringBuffer sb2=new StringBuffer("omnkars");
		System.out.println(sb2.deleteCharAt(2));
		
	}
}

*/



/*
public class StringBuffer2
{
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("Deva");
		System.out.println(sb1.reverse());    //its used to reverse a StringContent
		
	}
}

*/



/*

//String substringB(int index) : This method can be used to retrieve a part of a StringBuffer begining from specified index position upto the end of the StringBuffer
//String substring(int index,int offset) - This method can be used to retrieve a part of the StringBuffer begining from the specified index position upto the specified offset

public class StringBuffer2
{
	public static void main(String[] args) {
		
		StringBuffer sb1=new StringBuffer("DevaRajan");
		
		System.out.println(sb1.substring(3));
		System.out.println(sb1.substring(3,5));
	}
	
	
}


*/


/*

//public void setLength(int length)  - iam setting a particular length for a string

public class StringBuffer2
{
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("TamannaBhatia");
		sb.setLength(7);
		System.out.println(sb);
		
	}
}


*/



/*

public class StringBuffer2
{
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(1000);  //want to increase capacity dynamically,based on our requirement
		System.out.println(sb.capacity());
		
	}
}

*/


/*

public class StringBuffer2
{
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer(1000);  //1st we allocated 1000 memory locations on our requirement
		System.out.println(sb.capacity());
		
		sb.append("abc");                        //we added 3 characters    
		System.out.println(sb.capacity());       //1st we allocated 1000 memory locations on our requirement
		sb.trimToSize();                         //If we know this is end, we dont want to waste remaining memory locations wil deallocated so we use .trimToSize();
		System.out.println(sb.capacity());
	}
}


//

*/





















