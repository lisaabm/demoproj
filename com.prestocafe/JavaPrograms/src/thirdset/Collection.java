package thirdset;

import java.util.Iterator;
import java.util.ArrayList;
public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al = new ArrayList<String>();
        al.add("jessin");
        al.add("jeeva");
        al.add("ann");
        
        // Get the iterator
        Iterator<String> it = al.iterator();

        // Print the first item
        //System.out.println(it.next());
        
        while(it.hasNext()) {
        	  System.out.println(it.next());
        	}
	}
}



