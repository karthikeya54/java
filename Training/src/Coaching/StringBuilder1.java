package Coaching;


//Check wt available methods in StringBuffer cmd ---> javap java.lang.StringBuffer(there are some synchronized methods) so to overcome this Synchronized  problm we wil go for StringBuilder


// Working like as an StringBuilder
//Where ever Buffer is there rename with Builder
//where ever synchronized word is there remove that word then it acts as StringBuilder(every method exactly same as in StringBuffer exactly same as StringBuilder except synchronization keyword/Buffer-> Builder)




/*


				StringBuffer                               Vs                   StringBuilder

1) Every method present in StringBuffer is Synchronized				No Method present in StringBuilder is Synchronized

2) At a time only one thread is allowed to operate on               At a time multiple Thread Are allowed to operate on 
   StringBuffer object and hence it is ThreadSafe.                  StringBuilder object and hence it is not ThreadSafe.

3) Threads are required to wait to operate on  						Threads are not required to wait to Operate on StringBuilder 
   StringBuffer object and Hence relatively performace              object And Hence Relatively performance is high.
   is slow.
   
4) Introduced in 1.0 version										Introduced in 1.5 version.


*/




//   String Vs StringBuffer Vs StringBuilder


// If content is fixed and Wont change Frequently we go for String.

// If content  will change frequently but thread safety is required then we should go for StringBuffer.

// If content wil change frequently and thread safety is not required then we should go for Stringbuilder.






/*

// method chaining


class StringBuilder1
{
	public static void main(String[] args) 
	{
		StringBuilder sb=new StringBuilder();
		sb.append("omkars").append("computer").reverse().insert(2, "xyz");
		
		System.out.println(sb);
		
	}
}


*/


/*
public class  StringBuilder1
{
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder(5);
		String s="";
		
		if(sb.equals(s)) 
		{
			System.out.println("match 1");
			
		}
		else if(sb.toString().equals(s.toString()))
		{
			System.out.println("Match 2");
			
		}
		
		else
		{
			System.out.println(" No Match");
		}
		
	}
}


*/
/*


What is the Result????
		
A. Match 1
B. Match 2
C. No Match
D. NullPointerException is thrown at runtime


*/

/*

Explaination:

	    equals() is overriden in stringclass for content comparision.
	But equals() is not overriden in StringBuffer for content comparision its only for reference comparision(object class is executed for StringBuffer & StringBuilder)
	In StringBuilder equals() method is not overridden and hence object class equals() method wil be executed. If arguments are differnet type then equals() method 
	returns false.
	
	hence 1) sb.equals(s) returns false.
	
	2) But String class equals() method meant for content comparision.
	Hence sb.toString().equals(s.toString()) returns true.

*/












/*

// which statemetn will empty the contents of a StringBuilder variable named sb???

1) sb.deleteAll()           //such type of method is not available  StringBuffer/StringBuilder
2) sb.delete(0,sb.size())   //such type of method is not available  StringBuffer/StringBuilder
3) sb.delete(0,sb.length())    // it deletes from 0 index to  end of wt everstringlength-1
4) sb.removeAll()            //such type of method is not available in StringBuffer/StringBuilder

*/


/*

public class StringBuilder1
{
	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("omkars");
		sb.delete(0,6);                                //it deletes from 0 index to 6-1 charachters
		System.out.println(sb);
		
		
	}
}

*/




























