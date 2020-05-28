package SeleniumPractice;

import org.testng.annotations.Test;

public class icount {
	@Test(invocationCount=5)
	public void sum()
	{
		int a=10;
		int b =10;
		int c = a+b;
		System.out.println(c);
				
	}

}
