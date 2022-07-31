package Secondset;

public class Aggreg2 {
	int age;
	String name;
	Aggreg1 region;
	
	public Aggreg2(int age,String name,Aggreg1 region)
	{
		this.age=age;
		this.name=name;
		this.region=region;
	}
	
	public void print()
	{
		System.out.println("Name: "+name+" Age: "+age);
		System.out.println("City: "+region.city+" Place: "+region.place+" Country: "+region.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aggreg1 a=new Aggreg1("PTA","Kerala","India");
		Aggreg1 b=new Aggreg1("TVM","Kerala","India");
		Aggreg2 c=new Aggreg2(26,"Lisa",a);
		Aggreg2 d=new Aggreg2(26,"Sneha",b);
		c.print();
		d.print();
	}

}
