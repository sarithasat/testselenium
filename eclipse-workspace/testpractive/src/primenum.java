
public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=39877;
		int i=0;
		int count=0;
		for(i=1; i<num;i++) {
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==1)
			{
				System.out.println("number is prime");
			}
			else
				System.out.println("no is not prime");
		}

	}


