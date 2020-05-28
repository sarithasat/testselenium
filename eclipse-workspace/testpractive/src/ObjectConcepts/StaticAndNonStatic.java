package ObjectConcepts;

public class StaticAndNonStatic {
	
	String name ="TOM";
	static int age =15;		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   sum();
   StaticAndNonStatic.sum();
  
   System.out.println(age);
	}
	
	public void sendMail()
	{
		System.out.println("this is non static");
	}
	public static void sum()
	{
		System.out.println("this is static");
	}

}
