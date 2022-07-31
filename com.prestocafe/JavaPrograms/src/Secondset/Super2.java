package Secondset;

public class Super2 extends Super1 {
	
	public void set()
	{
		System.out.println("Child class");
	}
	public void get()
	{
		set();
		super.set(); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super2 m=new Super2();
		m.get();
	}

}
