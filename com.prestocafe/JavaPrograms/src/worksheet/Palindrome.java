package worksheet;

public class Palindrome {	
			static int r=0;
			static int sum=0;
		    static int temp=0;	   		
			public static void getReverse(int n)
			{
		    	temp=n;
				while(n>0)
				{
					r=n%10;
					sum=(sum*10)+r; 
					n=n/10;
				}
				getResult();
			}
			public static void getResult()
			{
				if(temp==sum)
				System.out.println("Palindrome Number ");
				else
				System.out.println("Not a Palindrome Number");
			}  
	public static void main(String[] args) 
	{
		getReverse(9879);
	}

}
