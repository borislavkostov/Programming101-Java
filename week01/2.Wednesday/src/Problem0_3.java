


public class Problem0_3
{
	public static void main(String args[])
	{
		int numbers[]={2,4,5,6,22,6,653,-3,6,4,-5124,-3,-13};
		int temp=0;
		boolean flag=true;
		while(flag)
		{
			flag=false;
		for(int i=0;i<numbers.length-1;i++)
		{
			if(numbers[i]>numbers[i+1])
			{
				temp=numbers[i];
				numbers[i]=numbers[i+1];
				numbers[i+1]=temp;
				flag=true;
			}
		}
		}
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i]+",");
		}
		System.out.println();
		System.out.printf("The min number is = %d",numbers[0]);
	}
}
