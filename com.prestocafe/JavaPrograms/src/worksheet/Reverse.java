package worksheet;
//34. Program to find the reverse of a number
// Two constructors, one for calculation reverse and other for display “Finding reverse…”
// Argument variable and instance variable should be same
// Main method allows to invoke only one constructor

public class Reverse {
	
		int a;
		int sum;
		public Reverse()
		{ this(4567);
		System.out.println("Reverse of this no is:"+sum);
		}
		public Reverse(int a) {
		this.a=a;
		sum=0;
		int rem=0;
		while(a>0)
		{
		rem=a%10;
		sum=sum*10+rem;
		a=a/10;
		}
		}
		public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reverse a=new Reverse();
		}
		}


