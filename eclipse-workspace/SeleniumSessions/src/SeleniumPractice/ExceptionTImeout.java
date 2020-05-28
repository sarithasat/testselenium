package SeleniumPractice;

import org.testng.annotations.Test;

public class ExceptionTImeout {
	@Test(invocationTimeOut=2000,expectedExceptions=NumberFormatException.class)
	public void intLoop()
	{
		int i=1;
		while(i==1)
		{
			System.out.println(i);
		}
	}

}
