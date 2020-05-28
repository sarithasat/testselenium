package Oopsconcepts;

public class HSBC implements USBank,UKBank{
  public void credit() {
	  System.out.println("credit");
  }
  public void debit() {
	  System.out.println("debit");
  }
  public void transfermoney() {
	  System.out.println("transfermoney");
  }
  public void educationloan() {
	  System.out.println("educationloan");
  }
  public void mutualfund()
  {
	  System.out.println("mutualfund");
  }
}
