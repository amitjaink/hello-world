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
	
	public Person(String name)  
	{ 
		this.name = name; 
	}
	
	public boolean isAsleep(int hr)  
	{ 
		return 22 < hr || 7 > hr; 
	}
	  
	public String toString()      
	{ 
		return name; 
	}

	public void status( int hr )
	{
		if ( this.isAsleep( hr ) )
			System.out.println( "Now offline: " + this );
	    else
	    	System.out.println( "Now online: " + this );
	 }
	
}
public class Student extends Person
{
	public Student(String name)  {
		super(name);
	}

	public boolean isAsleep( int hr ) // override 
	{ 
		return 2 < hr && 8 > hr; 
	}
	
	public static void main(String[] args)
	{
		Person p;
		p = new Student("Sally"); 
		p.status(1); - gets called on Student object - goes to Person class status method and then isAsleep is called from Student class
	}
}

prints - Now online

