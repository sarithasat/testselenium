package Abstractconcept;

public abstract class Bank {
	
	public abstract void loan();
	
	public void credit()
	{
		System.out.println("credit");
	}

	public void debit()
	{
		System.out.println("debit");
	}
}
