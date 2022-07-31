package firstset;

public class Student10 
{
	int rollno;
	String name;
	static String college="CET";
public static void main(String args[])
{
	Student10 s1=new Student10();
	Student10 s2=new Student10();
	
	s1.getDetails(1,"jeeva");
	s1.printDetails();
    s2.getDetails(2,"Nidhi");
	s2.printDetails();
}
public void getDetails(int r,String n)
{
	rollno=r;
	name=n;
	//System.out.println("Rollno"+r);
}
public void printDetails()
{
	System.out.println("Rollno:"+rollno+" Name:"+name+" College:"+college);
}
}

