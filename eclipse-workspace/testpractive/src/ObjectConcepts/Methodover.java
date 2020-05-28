package ObjectConcepts;

public class Methodover {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodover M= new Methodover();
		
		M.sum(1);
		M.sum(1,2);
		M.sum();

	}
	public void sum() {
		System.out.println("this is main method");
	}
	public void sum(int i) {
		System.out.println("this is one  method");
	}
	public void sum(int i, int j) {
		System.out.println("this is 2 method");
	}
}
