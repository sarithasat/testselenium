package ObjectConcepts;

public class Functions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Functions f1 = new Functions();
		f1.test();
		int c=f1.pqr();
		System.out.println(c);
		f1.qa();
		f1.division(4,6);
		//non static methods
	}
		public void test(){//no input no output
			System.out.println("test method");
		}
			
		public int pqr(){//no input but someoutput
			System.out.println("pqr");
			int a =10;
			int b= 20;
			int c =a+b;
			return c;
		}
		public String qa() {//no input but some output
			System.out.println("qa method");
			String f ="selentiy=um";
			return f;
		}
		
		public int division(int x, int y) {
			System.out.println("divsion");
			int k =x/y;
			return k;

	}
}
