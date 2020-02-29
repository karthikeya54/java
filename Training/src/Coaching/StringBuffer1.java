package Coaching;





// Important constructors of StringBuffer



/*

//StringBuffer sb=new StringBuffer();
public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer();
		System.out.println("The initial capacity of StringBuffer is "+sb.capacity());
		
		sb.append("abcdefghijklmnop");
		System.out.println("iam adding 16 characters after that sb capacity is"+sb.capacity());
		
		sb.append("q");   //after 16 characters only the the capacity may increase by using this formula old=(cc+1)*2 , old=(16+1)2 --> 34, old=(34+1)*2=70
		System.out.println("iam appending 17th charcter then the capacity of sb is"+sb.capacity());
		
		sb.append("r");
		sb.append("s");
		System.out.println("extra one character appending then "+sb.capacity()); //after 34th character only the StringBuffer size may increase
	}

}

*/




/*
//StringBuffer sb=new StringBuffer(int initialcapactiy);   --->based on our requirement if we want more characters we can keep fixed capacity, if we increase the capacity it increases without making any false

public class StringBuffer1 {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer(1000);
		System.out.println("The initial capacity of StringBuffer is "+sb.capacity());
		
		sb.append("k");
		System.out.println("just adding 1001 character "+sb.capacity());

	}
}

*/





/*


//StringBuffer sb=new String(String s);    //for this StringBuffer(String s) ---> defaultcapacity+how many characters we added to the string


public class StringBuffer1
{
	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("omkars");
		System.out.println(sb.capacity());     
	}
}


*/





























