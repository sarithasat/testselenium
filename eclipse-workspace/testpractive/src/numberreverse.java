import java.util.Scanner;

public class numberreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rev = 0;
		int num=245;
		int count=0;
		int sum=0;
		Scanner in= new Scanner(System.in);
		
		while(num!=0)
		{
			
			rev = rev*10 +num%10;
			sum=sum+num%10;
			num= num/10;
			count++;
		
		}
	
		System.out.println(rev);
		System.out.println(count);
		System.out.println(sum);
		

	}

}
