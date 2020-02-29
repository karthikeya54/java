


package Coaching;


/*
 
 Difference between Call by Value and Call by Reference
 
 Call by Value means calling a method with a parameter as value. Through this, the argument value is passed to the parameter.

While Call by Reference means calling a method with a parameter as a reference. Through this, the argument reference is passed to the parameter.

In call by value, the modification done to the parameter passed does not reflect in the caller's scope
while in the call by reference,the modification done to the parameter passed are persistent and
changes are reflected in the caller's scope.
 
 
 
 */




/*

Call by Value and Call by Reference in Java
There is only call by value in java  
If we call a method passing a value, it is known as call by value.
 The changes being done in the called method, is not affected in the calling method.

*/


/*

class CallbyValueAndCallbyRefernce
{  
	 int data=50;  
	  
	 void change(int data)
	 {  
	 data=data+100;//changes will be in the local variable only ,when ever variable exits the block it wil be deleted
	System.out.println(data);
	 }  
	     
	 public static void main(String args[])
	 {  
		 CallbyValueAndCallbyRefernce obj1=new CallbyValueAndCallbyRefernce();  
	  
	   System.out.println("before change "+obj1.data);  //50  
	   obj1.change(456);  
	   System.out.println("after change "+obj1.data);   //50
	  
	 }  
	}  

*/








/*
// Call by Reference

//In case of call by reference original value is changed if we made changes in the called method. 
If we pass object in place of any primitive value, original value will be changed. 
In this example we are passing object as a value. Let's take a simple example:

*/




class CallbyValueAndCallbyRefernce{  
 int data=50;  
  
 void change(CallbyValueAndCallbyRefernce op){  
 op.data=op.data+100;//changes will be in the instance variable  
 }  
     
    
 public static void main(String args[]){  
	 CallbyValueAndCallbyRefernce op=new CallbyValueAndCallbyRefernce();  
  
   System.out.println("before change "+op.data);  //50 
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
  
 }  
}  




























