package Inheritence;

public class Child  {
	public void getB()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child i=new Child();
		Parent k=new Parent();
		k.getA();
		i.getB();
	}

}
