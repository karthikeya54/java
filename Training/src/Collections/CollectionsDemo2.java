package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/*

public class CollectionsDemo2 {

	public static void main(String[] args) 
	{
		
		ArrayList<String> al=new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		al.add("five");
		al.add("six");
		al.add("seven");
		
		System.out.println(al);

		for(String s:al)
		{
			System.out.println(s);                     
		}
		
		ArrayList<String> al2=new ArrayList();  
		
		al2.add("Ramu");
		al2.add("karthik");
		al2.add("praneeth");
		al2.add(1,"Radha");
		
		System.out.println(al2);
		
		for(String kk:al2)
		{
			System.out.println(kk);
		}
		
//If we want to add one list to another list use addAll();		
		al2.addAll(al);
		System.out.println(al2);
		
		al.addAll(2, al2);    //inserting all values from one list to another for particular index adding.
		System.out.println(al);
		
		System.out.println("finding out the 2 arraylist values are same or not"+al.equals(al2));
		
	}

}


*/



/*


class CollectionsDemo2
{
	public static void main(String[] args) {
		
		ArrayList<String> d=new ArrayList<String>();
		
		d.add("dsfsd");
		d.add("sdfrnfds");
		d.add("sdfrnfds");
		d.add("werwer");
		d.add("sdfrnfds");
		
		System.out.println(d);
		
		System.out.println("finding out the first indexOf() of that content "+d.indexOf("sdfrnfds"));
		System.out.println("finding out last indexOf(it only finds out lastindexOf()   "+d.lastIndexOf("sdfrnfds"));
		System.out.println("Checking the list isEmpty or not "+d.isEmpty());
		d.clear();             //here we are using clear();  so it gives empty list
		System.out.println(d);
		
		ArrayList f=new ArrayList();
		System.out.println("Checking that list isEmpty or not"+f.isEmpty());
		
		f.add("Rajesh");
		f.add("Rajesh");
		f.add("girish");
		f.add("Rajesh");
		System.out.println("List allows duplicate values alsooo "+f);
		
	}
}

*/



class CollectionsDemo2
{
	CollectionsDemo2(int sno,String name,int age)
	{
		System.out.println("your sno is : "+sno+"your name is : "+name+"your age is "+age);
	}
	
	public static void main(String[] args) 
	{
		
	List<CollectionsDemo2> l=new ArrayList<CollectionsDemo2>();	
	
		l.add(new CollectionsDemo2(1,"Karthikeya",24));
		l.add(new CollectionsDemo2(1,"Anuragh",24));
		
		
		
	HashMap<String,String> h=new HashMap<String,String>();
	
	h.put("name", "Karthik");
	h.put("bookName", "AC Machines");
	h.put("bookName", "DC Machines");
	h.put("pen", "Reynolds");
	h.put("bottle", "ThumpsUp");
		
	System.out.println(h.get("bookName"));
		
	}
}










