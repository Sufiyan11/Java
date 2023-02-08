import java.util.*;
class trycatch
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n=scan.nextInt();
		try
		{
			int arr[]=new int[n];
			int sum=0;
			if(n>0){
			System.out.print("Enter the elements : ");
			for(int i=0;i<n;i++)
			{
				arr[i]=scan.nextInt();
				sum+=arr[i];
			}
			System.out.println("Sum of given array of elements : "+sum);
			}
			else System.out.println("Enter non-zero value.");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Array size cannot be negative ");
		}
	}
}
		