package Secondset;

public class Encap1 {
	private int rollno;
	private String name;
	
	public void setDetail(int r,String n)
	{
		rollno=r;
		name=n;
	}
	
	public void getDetail()
	{
		System.out.println(rollno);
		System.out.println(name);
	}

}
