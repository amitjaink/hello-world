package demos;
/** A class to store information about a Person
 *  Used in module 4 of the UC San Diego MOOC Object Oriented Programming in Java
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * 
 */
public class Person 
{
	private String name; 	
	  
	public String getName()      
	{ 
		return name; 
	}	
	public String toString(){
		
		return this.getName();
	}
}

public class Student extends Person
{
	private int studentID; 	
	  
	public int getSID()      
	{ 
		return studentID; 
	}	
public String toString(){
	
	return this.getSID() +":"+ super.getName();
}	
}

public class Faculty extends Person
{
	private int employeeID; 	
	  
	public int getEID()      
	{ 
		return employeeID; 
	}
public String toString(){
	
	return this.getEID() +":"+ super.getName();
}	
}

compiler only knows ref type - can only look in same ref type class for methods called


	 Superclass superRef = new Subclass() - Widening(Automatic type promotion like int to double)
	 Subclass subref = new Superclass() - is not allowed

     
	 Subclass ref = (Subclass) superRef	- Narrowing (expicit cast like double to int)
	 compiler trusts you in this case that you will point it to a Student object only since you casted it!!

Person s = new Student("Cara",1234);
s.toString() will point to Student class toString metho and print
compiler still thinks its pointing to Person class but at run time it will match compile 
time method signature to appropriate methos in actual object's class


s.getSID(); - will cause compile error

Need casting ((Student)s).getSID(); - this works fine

Person s = new Person("Tim");

((Student)s).getSID() - run time error in casting - class cast exception

can use instanceof functionality

	 
//assume constructor

Person s = new Student("Cara",1234);
s.toString() will point to Student class toString metho and print

Cara :1234


Superclass ref to subclass object is polyorphism
//assume appropriare constructors
Person p[] = new Person[3];

p[0] = new Person ("Tim");

p[1] = new Student ("Cara",1234);

p[2] = new Faculty ("Mia",ABCD);


p[0].toString - calls  toString from Person class
p[1].toString - calls  toString from Student class
p[2].toString - calls  toString from Faculty class
	 

