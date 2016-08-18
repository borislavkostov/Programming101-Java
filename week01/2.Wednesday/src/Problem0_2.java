import java.util.Scanner;

public class Problem0_2
{
 public static void main(String args[])
 {
	 Scanner input =new Scanner(System.in);
	 System.out.println("Enter n : ");
	 int n =input.nextInt();
	 boolean isPrime=true;
	 for (int i = 2; i <= n; i++) 
	 {
	        if (n % i == 0&&n!=i) 
	        {
	            isPrime= false;
	            break;
	        }
	        else
	        {
	        	isPrime=true;
	        	break;
	        }
	 }
	 System.out.printf("Is %d prime number ? : %b",n,isPrime);
 }
}
