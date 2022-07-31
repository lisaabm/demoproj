package worksheet;

import java.util.Scanner;

//31. Write a program to find the Area of figures
//a) Circle (pi*r*r)
//b) Rectangle(l*b)
//c) Square(a*a)
// Prompt the user to select the options(a/b/c) from command prompt.
// Get the inputs that needs to find area.


public class AreaofFig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter ur choice for circle enter 1, for rectangle enter 2, for square enter 3");
	       int b=sc.nextInt();
	       switch(b)
	       {
	       case 1:
	    	   
	    	  System.out.println("Enter the radius");
	    	  float r=sc.nextFloat();
	    	   float area=(3.14f*r*r);
	    	   System.out.println("Area of circle is"+area);
	    	   break;
	       case 2:
	    	   
	    	   System.out.println("Enter the length and breadth");
	    	   float l=sc.nextFloat();
	    	   float c=sc.nextFloat();
	    	   float area1=l*c;
	    	   System.out.println("Area of Rectangle is"+area1);
	    	   break;
	       case 3:
	    	  
	    	   System.out.println("Enter the side");
	    	   float a=sc.nextFloat();
	    	   float area3=a*a;
	    	   System.out.println("Area of square is"+area3);
	    	   break;
	        default:
	            System.out.println("You entered wrong choice");  
	       
	       }
	       }
	}

