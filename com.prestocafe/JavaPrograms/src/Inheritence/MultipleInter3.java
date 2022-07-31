package Inheritence;

public class MultipleInter3 implements MultipleInter1, MultipleInter2 {
	
	public void print()
	{
		System.out.println("Print Method");
	}
	
	public void show()
	{
		System.out.println("Show Method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInter3 a=new MultipleInter3();
		
		a.print();
		a.show();

	}

}
