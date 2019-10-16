package abstractandinterface;

public class Testbankclass {

	public static void main(String[] args) {
		
		Hdfcbank hb =new Hdfcbank();
		hb.credit();
		hb.debit();
		hb.razz();
		hb.loan();
		hb.funds();
		
		
		Bank b=new Hdfcbank();
		b.credit();
		b.debit();
		b.razz();
		b.loan();
		//here we cant acess the funds method 
		
		

	}

}
