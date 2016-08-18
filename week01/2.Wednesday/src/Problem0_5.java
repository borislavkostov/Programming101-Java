
public class Problem0_5
{
 public static  void main(String args[])
 {
	 int[] number={6,6,5};
	 double sum = 0;
	 for (int i = 0; i < number.length; i++)
	{
		sum+=number[i];
	}
	 System.out.printf("The average of array is %.2f",sum/number.length);
 }
}
