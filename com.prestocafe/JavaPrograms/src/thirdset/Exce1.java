package thirdset;

public class Exce1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int bal=50000;
        int withdraw=100000;
        if(withdraw>bal)
        {
        	try {
        		throw new MyException("Balance Insufficent");
        	}
        	catch(MyException e) {
        		System.out.println("inside the catch statmt");
        	}
        }
        
	}

}
