package firstset;

public class Student13 
{
	public Student13()
	{
	this(33);
	System.out.println("Default Constructor");
	}
	public Student13(int rollno)
	{
		System.out.println("RollNo."+rollno);
	}
	public static void main(String args[])
	{
		Student13 s=new Student13();
	}
}
