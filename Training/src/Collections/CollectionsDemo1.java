package Collections;

import java.util.ArrayList;

/*

import java.util.*;



public class CollectionsDemo1 
{

	public static void main(String[] args) 
	{
		
		List al= new ArrayList();
		System.out.println("just Knowing what is there in ArrayList   " +al);
		
		
		al.add(45);
		al.add("karthik");
		al.add(45.34);
		al.add('k');
		
		System.out.println("After adding heteroginous values in one ref variable(object) i.e in List  "+al);
		

		
		//In ArrayList if we want to store homogenious values(Similar/Same type of datatype elements)...So we use Generics Concept
		
		System.out.println(  
				
				);
		
		List<String> al1=new ArrayList<String>();
		
		al1.add("Raju");
		al1.add("Rani");
		al1.add("Teja");
		//al1.add(1, "Middle Element");
		//al1.add(4545);   //not applicable for int/float/char
		System.out.println("After adding sametype of datatype elements "+al1);
		
		
		
		
		System.out.println(
				
						);
		//By using Generics    Method-2
		
		List<Integer> al2=new ArrayList<>();
		al2.add(3434);
		al2.add(234);
		al2.add(23556);
		
		for(int i:al2) {
			System.out.println("we are retrieving values from an ArrayList   "+i);
		}
		
		
		
		
	}

}

*/





//Iterator is an interface that iterates the elemets. It is used to traverse the list and modify the elements. Iterator interfave has three methods:
// hasNext() , next() , remove()

import java.util.*;

class CollectionsDemo1
{
	
	public static void main(String[] args) 
	{
		
		List<Float> kk=new ArrayList<>();  //here we are giving Object type elements, not primitive Type
		
		kk.add(343.4f);
		kk.add(9293.45f);
		kk.add(0239.34f);
		System.out.println(kk.get(1));  //Object get(int index) - It is used to fetch the element from the particular position of the list.
		//int size() - it is used to return the number of elements present in the list.

		
		
		List<String> al=new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("Rajesh");
		al.add("Bhatia");
		al.add("kajol");
		
		
		/*
		System.out.println("In forward direction by using ListIterator ");
		ListIterator<String> itr=al.listIterator();
		while(itr.hasNext())  //to check next element is available or not
		{
			System.out.println(itr.next());
		}
		
		System.out.println("In reverse Direction  ");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
		
		*/
		
		
		/*
		// By using Iterator Interface
		Iterator itr1=al.iterator();   //In this Iterator there is no reverse/hasPrevious();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		*/
		
		
		/*
		System.out.println("By using for each method & we use lambda Expression");
		al.forEach(b->{
			System.out.println(b);                                     //by using foreach we can get o/p
		});
		*/
		
		
		/*
		System.out.println("By using foreachReamaining method & we use lambda Expression");
		
		Iterator<String> itr=al.iterator();
		itr.forEachRemaining(a->{
			System.out.println(a);                                        //by using foreachRemaining we can get o/p
		});
		*/
		
		
		
		
	}
}









