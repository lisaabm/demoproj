package thirdset;

public class Annot2 extends Annot1{
	//@override
	public void run(int a)
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Annot2 b=new Annot2();
		b.run(3);

	}

}
