package Inheritence;

public class Bike extends Vehicle{
	public void run()
	{
		System.out.println("Bike is running safely");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bike b=new Bike();
		b.run();
//		Vehicle v=new Vehicle();
//		v.run();
	}

}
