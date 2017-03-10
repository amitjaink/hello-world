package demos;

class Person 
{
	void method1();
	{
		System.out.println("Person 1");
	}	
	void method2();
	{
			System.out.println("Person 2");
	}
}

class Student extends Person 
{
	void method1();
	{
	System.out.println("Student1");	
	super.method1()
	method2();
	}
	
	void method2();
	{
			System.out.println("Student 2");
	}
	
}
class Undergrad extends Student 
{

	void method2();
		{
			System.out.println("Undergrad  2");
	}
}


Person u = new Undergrad();
u.method1();

it prints this:

Student 1
Person1 
Undergrad2


***********
u refers to undergrad object
method1 is called from student class
  withing  that super.method1 calls method 1 from person class
method 2 is called from Undergrad class (java makes it this.method2())
at run time this points to undergrad object.
  
  
  
  