package firstset;

public class Student12 
{
	int rollno;
	String name;
	public void getDetails(int rollno, String name)
	{
		this.rollno=rollno;
		this.name=name;
		this.printDetails();
	}
	public void printDetails()
	{
	System.out.println("RollNo."+this.rollno+"Name:"+this.name);
	}
	public static void main(String args[])
	{
		Student12 s=new Student12();
		s.getDetails(6,"Lisa");
	}
}
