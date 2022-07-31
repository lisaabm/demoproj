package firstset;

public class DefConstructor {
public DefConstructor(int rollno, String name) {
		// TODO Auto-generated constructor stub
	System.out.println(rollno +name);
	
	}

public DefConstructor() {
	System.out.println("This is default Constructor");
	// TODO Auto-generated constructor stub
}

public static void main(String args[])
{
	DefConstructor p=new DefConstructor(2,"Lisa"); //calling a parameterized constructor
	DefConstructor d=new DefConstructor(3,"Dhanya");
	DefConstructor m=new DefConstructor();
}
}
