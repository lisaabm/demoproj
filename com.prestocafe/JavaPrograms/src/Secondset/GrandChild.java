package Secondset;

public class GrandChild extends Child
{
	public void getGrandChild()
	{
		System.out.println("This is inside GrandChild");
	}

	public static void main(String[] args)
	{
		GrandChild a=new GrandChild();
		a.getParent();
		a.getChild();
		a.getGrandChild();
	}

}
