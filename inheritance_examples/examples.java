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
}

public class Student extends Person
{
	private int id; 	
	  
	public int getID()      
	{ 
		return id; 
	}
	
}

public class Faculty extends Person
{
	private int id; 	
	  
	public int getID()      
	{ 
		return id; 
	}	
}

Superclass superRef = new Subclass() - Widening(Automatic type promotion like int to double)

Subclass subref = new Superclass() - is not allowed

Subclass ref = (Subclass) superRef	- Narrowing (expicit cast like double to int)
	 compiler trusts you in this case that you will point it to a Student object only since you casted it!!

Person p = new Student() --- is allowed ( Derived is a base read from right to left)

Persons[] p = new Personn[3] ; 
p[0] = new Person(); --- is allowed 
p[1] = new Student();--- is allowed 
p[2] = new Faculty(); --- is allowed 




Student s = new Student(); 
Person p = new Person();
Person q = new Person();

Faculty f= new Faculty();
Object o = new Faculty();


String n = s.getName(); --OK
p=s; --OK (base class ref can point to derived class ref)
int m = p.getID(); -does not work.compiler doesnt know p refers to student object .it caused compilation error.
                     
int m = ((Student)p).getID();- it works fine with casting.


f=q ; - all Person cannot be Faculty - not allowed. it cannot work even with casting.Run time cast exception will happen.
        (derived class ref cannot point to base class ref)           

Superclass superRef = new Superclass()
Subclass ref = (Subclass) superRef		- is not allowed

		
		
		
o= s; -- allowed OK. everything in Java is object.
     (base class ref can point to derived class ref)

	 
when a "new" call happens - Objects are created from inside out - base class first and then derived class;
java compiler inserts call to super() in all the constructors so that all the objects are created from inside out -"Öbjecct" class to start with and 
then base class like Person and then derived class like student.


	 