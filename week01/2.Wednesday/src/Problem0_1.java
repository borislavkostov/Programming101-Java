import java.util.Scanner;

public class Problem0_1 
{
	public static void main (String[] args)
	{
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n : ");
		n=input.nextInt();
		boolean isOdd=(n%2!=0);
		System.out.printf("Is %d odd number ? : %b",n,isOdd);
	}
}
