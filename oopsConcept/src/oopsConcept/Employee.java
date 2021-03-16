package oopsConcept;

public class Employee{ 

	 float salary=40000;  
	} 

	// Programmer class is the child class which extends Employee class
	class Programmer extends Employee{  

	 int bonus=10000;  
	 public static void main(String args[]){  

	//create an object of programmer class 
	   Programmer p=new Programmer();  
	   // now you can access the properties and behaviour of parent class through the child class object
	   // as showed below 
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}