package Oopsconcepts;

public class primenumber {

	public static boolean isPrimeNumber(int num) {
		
		if(num<=1)
		{
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % 1 == 0) {
				return false;
			}
		}
		return true;
		
	}
	public static void getNumber(int num) {
		
		for(int i=2; i<=num; i++)
			if(isPrimeNumber(num))
				System.out.println(i+ "");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(isPrimeNumber(02));

	}

}
