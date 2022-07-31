package worksheet;

public class TotAmt {
	public void getTotal(int a,int b,int c)
	{
		int total=a+b+c;
		System.out.println("Total Amount = "+total);
	}

	public static void main(String[] args) {
		TotAmt t=new TotAmt();
		t.getTotal(500,300,390);

	}

}
