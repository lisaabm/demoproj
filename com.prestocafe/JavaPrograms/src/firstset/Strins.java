package firstset;

public class Strins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String();
		s="Hello World";
		int size=s.length();
		System.out.println(size);              
		System.out.println(s.replace('H','m'));     //to replace a letter
		System.out.println(s);
		System.out.println(s.charAt(8));            //return the character at 8th index position
		System.out.println(s.toUpperCase());        //letters to upper case
		System.out.println(s.toLowerCase());        //letters to lower case
		
		
		String s1="hello World";
		String s2="Lisa";
		System.out.println(s.equals(s1));            //checks whether s is same as s1
		System.out.println(s.equals(s2));            //checks whether s is same as s2 
		System.out.println(s.equalsIgnoreCase(s1));  //checks whether s is same as s1 ignoring cases
		System.out.println(s.indexOf("e"));          //position of 'e'
		System.out.println(s1.concat(s2));           //to print both s1 and s2
		
		//to overcome immutable property
		
		StringBuffer b=new StringBuffer("hello world");
		System.out.println(b.reverse());
		
		StringBuilder m=new StringBuilder("jeeva");
		System.out.println(m.reverse());

	}

}

