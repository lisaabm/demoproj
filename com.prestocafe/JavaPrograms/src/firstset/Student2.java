package firstset;

public class Student2 {
	public void printMethod()
	{
		System.out.println("Inside the Print Mehod");
		displayMethod();
	}
	public void displayMethod()
	{
		System.out.println("Inside the Display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s=new Student2();
		s.printMethod();
	}

}
