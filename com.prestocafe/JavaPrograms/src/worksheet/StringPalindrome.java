package worksheet;

public class StringPalindrome {
		public static void main(String[] args) 
		{
			checkPalindromeReverse("Malayalam");
			checkPalindromeReverse("Java");
		}
		private static void checkPalindromeReverse(String str)
		{
			StringBuilder sb = new StringBuilder(str);
			if(str.equalsIgnoreCase(sb.reverse().toString()))
			{
				System.out.println(str + " is a Palindrome");
			}
			else
			{
				System.out.println(str + " is not a Palindrome");
			}       
		}
			private static void checkPalindrome(String str)
			{
			StringBuilder sb = new StringBuilder();
			for(int i = str.length() - 1; i >= 0; i--){
				sb.append(str.charAt(i));
			}            
			if(str.equalsIgnoreCase(sb.toString())){
				System.out.println(str + " is a Palindrome");
			}else{
				System.out.println(str + " is not a Palindrome");
			}
		}
	}

