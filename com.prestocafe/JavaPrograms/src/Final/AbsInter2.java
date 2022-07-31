package Final;

public class AbsInter2 implements AbsInter1 {
	
	public void printable()
	{
		System.out.println("Print Inter");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsInter1 a=new AbsInter2();
		a.printable();
		
		AbsInter2 b=new AbsInter2();
		b.printable();

	}

}
