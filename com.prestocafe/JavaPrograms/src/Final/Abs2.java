package Final;

public class Abs2 extends Abs1 {
	
	public void run()
	{
		System.out.println("Run Method");
	}
	
	public void start()
	{
		System.out.println("Start Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Abs1 a=new Abs2();
		
		a.run();
		a.print();
		
		Abs2 b=new Abs2();
		b.start();
		b.print();	
		b.run();
	}

}
