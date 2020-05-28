import Oopsconcepts.HSBC;
import Oopsconcepts.USBank;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HSBC H = new HSBC();
       H.credit();
       H.debit();
       H.debit();
       H.transfermoney();
       
       USBank h1=new HSBC();
       h1.credit();
       h1.debit();
       
       System.out.println(USBank.min);
		
	}

}
