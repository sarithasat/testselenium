package ObjectConcepts;

public class CallByReference {
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByReference obj = new CallByReference();
		int y=5;
		int x=10;
		int z=obj.testSum(x, y);
		System.out.println(z);
		
//above is call  by value
		obj.p=50;
		obj.q=60;
		
obj.swap(obj);
	}
	
	public int testSum(int a, int b)
	{
		int c= a+b;
		return c;
	}
	public void swap(CallByReference t)
	{
		int temp;
		temp =t.p;
		t.p=t.q;
		t.q=temp;
		
	}

}
