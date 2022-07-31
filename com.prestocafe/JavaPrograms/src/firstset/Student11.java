package firstset;

public class Student11 
{
	int rollno;
	String name;
	public Student11(int rollno,String name)
	{
	this.rollno=rollno;
	this.name=name;
	System.out.println("Rollno:"+this.rollno+" Name:"+this.name);
	
	}
	
	public static void main(String args[])
	{
	Student11 s=new Student11(6,"Lisa");
	}
	}
